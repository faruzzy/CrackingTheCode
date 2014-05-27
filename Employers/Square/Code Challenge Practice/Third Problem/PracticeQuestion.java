/**
 * Implement a method to perform basic string compression using counts of repeated characters.
 * If the compressed string is larger than the original return the compressed string.
 */
public class PracticeQuestion {

    public static void main(String[] args) {
        String message = "abbbbaaaa";

        System.out.println("Here is the compressed version of " + message + " "
            + compression(message));
    }

    public static String compression(String message) {
        // Error checking
        if (message == null) return "";
        
        // Count the first character
        char c = message.charAt(0);
        int count = 1;

        StringBuffer compressedString = new StringBuffer();
        compressedString.append(c);

        for (int i = 1; i < message.length(); i++) {
            if (i + 1 == message.length()) compressedString.append(count + 1);

            if (message.charAt(i) == c) {
                count++;
                continue;
            }

            compressedString.append(count);
            
            c = message.charAt(i+1);
            count = 1;

            compressedString.append(c);
        }

        if (compressedString.toString().length() <= message.length()) return compressedString.toString();

        return message;
    }

}

/**
 * Lessons learned:
 * 
 * StringBuffer is great for generating strings on the fly
 * Continue will skip you to the next iteration of your loop which could then result in a break
 * out of the loop depending on the foor loop condition
 */