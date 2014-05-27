/**
 * Implement an algorithm to deterine if a string has all unique characters
 * What if you can't use additional datastructures
 */
public class PracticeQuestion {
    
    public static void main(String[] args) {
        String testString = "Waren";

        if (allUniqueCharacters(testString)) System.out.println("All unique characters.");
    }

    public static boolean allUniqueCharacters(String test) {
        boolean[] characters = new boolean[256];
        for(char c : test.toCharArray()) {
            if (characters[c]) return false;
            characters[c] = true;
        }
        return true;
    }
}

/**
 * Lessons learned:
 * 
 * Use toCharArray() to get a string to a character array
 * When declaring an array the type needs to be appended with square brackets
 * Ensure methods are static if called from static void main
 */