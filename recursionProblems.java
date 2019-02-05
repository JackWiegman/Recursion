public class recursionProblems {

	public static void main(String[] args) {
		//holy shit
		//boxes and shit bro mf memory
		//multiple returns bc full send we
		//doing this function 10000000 times at once 
		int runNum = 11;
		String reverseStr = "Made it";

		System.out.println("\nFibonacci: ");
		for (int i = 1; i < runNum + 1; i++) {
			System.out.println("Number " + i + ": " + findNthFib(i));
		}

		System.out.println("\nPadjenacci: ");
		for (int i = 1; i < runNum + 1; i++) {
			System.out.println("Number " + i + ": " + padjenacci(i));
		}

		System.out.println("\n" + "'" + reverseStr + "'" + " reversed: " + reverse(reverseStr));



	}

	public static int findNthFib(int n) {
		if (n < 0 || n==1) return 1;
		if (n == 0) return 0;

		int fibN = findNthFib(n-1) + findNthFib(n-2);

		return fibN; 
	}

	public static String reverse(String str) {
		if (str.length() <= 1) return str;

		return reverse(str.substring(1)) + str.substring(0, 1);
	}


	// Starts 1, 2, 3 then ever number found with:
	// P[n] = (P[n-1])^2 + (P[n-2])^2 + (P[n-3])^2
	// Fifth number by hand: 209
	public static double padjenacci(int n) {
		if (n == 0) return 0;
		if (n <= 1) return 1;
		if (n == 2) return 2;
		if (n == 3) return 3;

		return (Math.pow(padjenacci(n-1), 2) + Math.pow(padjenacci(n-2), 2)
				+ Math.pow(padjenacci(n-3), 2));
	}


}