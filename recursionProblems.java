public class recursionProblems {

	public static void main(String[] args) {
		//holy shit
		//boxes and shit bro mf memory
		//multiple returns bc full send we
		//doing this function 10000000 times at once 
		int runNum = 6;

		for (int i = 0; i < runNum; i++) {
			//System.out.println("Number " + i + ": " + findNthFib(i));
			System.out.println("Number " + i + ": " + padjenacci(i));
		}



	}

	public static int findNthFib(int n) {
		if (n < 0 || n==1) return 1;
		if (n == 0) return 0;

		int fibN = findNthFib(n-1) + findNthFib(n-2);

		return fibN; 
	}

	// NOT WORKING
	/* public static String reverse(String str) {
		int n = str.length();
		String fin = ""; 
		if (n == 1) {
			//return str.charAt(0);
		}

		//return fin.charAt(n) = str.charAt(str.length() - n);
	} */


	// Starts 1, 2, 3 then ever number found with:
	// P[n] = (P[n-1])^2 + (P[n-2])^2 + (P[n-3])^2
	// Fifth number by hand: 209
	public static int padjenacci(int n) {
		if (n == 0) return 0;
		if (n <= 1) return 1;
		if (n == 2) return 2;
		if (n == 3) return 3;

		return (int)(Math.pow(padjenacci(n-1), 2) + Math.pow(padjenacci(n-2), 2)
				+ Math.pow(padjenacci(n-3), 2));
	}


}