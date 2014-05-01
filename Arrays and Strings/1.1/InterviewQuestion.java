/*
 * Implement an algorithm to determine if a String has all unique characters.
 * What if you can't use additional data structures?
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		String sampleInput = args[0];

		if (lettersUnique(sampleInput)) {
			System.out.println("String characters are unique.");
		} else {
			System.out.println("Characters are repeated.");
		}

	}

	public static boolean lettersUnique(String input) {
		// Optimization, there are only 256 unique ASCII characters
		if (input.length() > 256) return false;

		boolean[] charByIndex = new boolean[256];
		
		char[] charSampleString = input.toCharArray();

		for (int i = 0; i < charSampleString.length; i++) {
			if (charByIndex[charSampleString[i]] == true) return false;

			charByIndex[charSampleString[i]] = true;
		}

		return true;
	}

}