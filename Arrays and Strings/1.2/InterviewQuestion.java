/*
 * Implement a function which reverses a null terminated string.
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		String input = args[0];
		System.out.println("The input string is: " + input);

		String inputReversed = reverseString(input);
		System.out.println("The reverse of the string is: " + inputReversed);
	}

	public static String reverseString(String toReverse) {
		char[] charArray = toReverse.toCharArray();
		int reverseIndex = charArray.length - 1;

		char temp;
		for (int i = 0; i < charArray.length / 2; i++) {
			temp = charArray[i];
			charArray[i] = charArray[reverseIndex];
			charArray[reverseIndex] = temp;
			reverseIndex--;
		}

		/**
		 * Note that if the string was two words at this point we could go
		 * about reversing each individual word now.
		 */
		return new String(charArray);
	}
}