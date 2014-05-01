/*
 * Given two strings write a method to decide if one is a permutation of another.
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		String firstInput = args[0];
		String secondInput = args[1];

		if (permutation(firstInput, secondInput)) {
			System.out.println("The strings are permutations of one another.");
		} else {
			System.out.println("The strings are not permutations of one another.");
		}
	}

	public static boolean permutation(String inputOne, String inputTwo) {
		// Optimization, if the strings aren't the same length they can't be permutations
		if (inputOne.length() != inputTwo.length()) return false;
		
		int[] charByIndex = new int[256];

		for (char c : inputOne.toCharArray()) {
			charByIndex[c]++;
		}

		for (char c2 : inputTwo.toCharArray()) {
			charByIndex[c2]--;
			if (charByIndex[c2] < 0) return false;
		}

		/**
		 * Note that because of the optimization we don't have to go back through all the
		 * bins to check if the count is zero.
		 */
		return true;
	}
}