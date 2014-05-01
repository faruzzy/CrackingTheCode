/**
 * Write a method to replace all spaces in a string with '%20'.
 * You may assume that the string has sufficient space at the end to hold the additional 
 * characters and that you are given the true length of the string.
 * 
 * If implementing in Java use a character array and peform the operation in place. 
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		String inputString = args[0];
		System.out.println("The input string is: " + inputString + " Length: " + inputString.length());

		int trueLength = Integer.parseInt(args[1]);
		System.out.println("The true length of the string is: " + trueLength);

		System.out.println("The version of the string with spaces replaced is: " + replaceSpaces(inputString, trueLength));
	}

	public static String replaceSpaces(String string, int trueLength) {
		// Error case
		if (trueLength == 0) return "";

		// If input was character array don't need this
		char[] charArray = string.toCharArray();
		int extraCharacters = string.length() - trueLength;

		for (int i = trueLength - 1; i >= 0; i--) {
			if (string.charAt(i) == ' ') {
				charArray[i + extraCharacters] = '0';
				charArray[i + --extraCharacters] = '2';
				charArray[i + --extraCharacters] = '%';
			} else {
				charArray[i + extraCharacters] = string.charAt(i);	
			}
		}

		return new String(charArray);
	}
}