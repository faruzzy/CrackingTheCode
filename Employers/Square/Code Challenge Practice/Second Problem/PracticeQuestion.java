/**
 * Given two strings write a method to determine if one is a permutation of the other.
 */
public class PracticeQuestion {
    
    public static void main(String[] args) {
        String sampleStringOne = "dog";
        String sampleStringTwo = "God";

        if (isPermutation(sampleStringOne, sampleStringTwo)) 
            System.out.println("The two strings are permutations of one another");
    }

    public static boolean isPermutation(String sampleStringOne, String sampleStringTwo) {
        // Error checking
        if (sampleStringOne == null || sampleStringTwo == null) return false;

        // Optimization
        if (sampleStringOne.length() != sampleStringTwo.length()) return false;

        int[] characterCount = new int[256];
        
        for (char c : sampleStringOne.toCharArray()) {
            characterCount[c]++;
        }

        for (char c : sampleStringTwo.toCharArray()) {
            characterCount[c]--;
            if (characterCount[c] < 0) return false;
        }

        return true;

    }
}

/**
 * Lessons learned:
 * 
 * We can convert primative types between one another.
 * Always check for nulls and handle error cases
 * Remember to optimize
 * ASCI characters are case sensitive, the map to different integer values depending on case
 */