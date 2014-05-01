/**
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. If the compressed string is not smaller than the
 * original string you should return the original string.
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		String input = args[0];
		System.out.println("The input string is: " + input);
		System.out.println("The compressed string is: " + compress(input));
	}

	public static String compress(String str) {
		int size = countCompression(str);

		if (size >= str.length()) {
			return str;
		}

		StringBuffer stringBuffer = new StringBuffer();
		
		char last = str.charAt(0);
		int count = 1;
		int compressedIndex = 0;

		for (int i = 1; i < str.length(); i++) {
			if (last == str.charAt(i)) {
				count++;
			} else {
				stringBuffer.append(last);
				stringBuffer.append(count);
				compressedIndex++;
				last = str.charAt(i);
				count = 1;
			}
		}

		stringBuffer.append(last);
		stringBuffer.append(count);

		return stringBuffer.toString();
	}

	public static int countCompression(String str) {
		// Error check
		if (str == null || str.isEmpty()) return str.length();

		// Compressed string size
		int size = 0;

		char last = str.charAt(0);
		int count = 1;

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				size += 1 + String.valueOf(count).length();
				last = str.charAt(i);
				count = 1;
			}
		}

		// Loop will miss last character, need to manually account for it
		size += 1 + String.valueOf(count).length();

		return size;
	}
}