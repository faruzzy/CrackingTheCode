/**
 * Assume you have a method isSubstring which checks if 
 * one word is a substring of another. Given two strings,
 * s1 and s2, write code to check if s2 is a rotation of s1
 * using only one call to isSubstring
 * 
 * ex. waterbottle is a rotation of erbottlewat
 * 
 * Note: This solution won't compile since isSubstring is an 
 * imaginary method for the purposes of this question.
 */
public class InterviewQuestion {
	
	public static void main(String[] args) {
		String s1 = args[0];
		String s2 = args[1];

		if (isRotation(s1, s2)) {
			System.out.println("s2 is a rotation of s1.");
		} else {
			System.out.println("s2 is not a rotation of s1.");
		}
	}

	public static boolean isRotation(String s1, String s2) {
		// Optimization, if the two strings aren't the same length they can't be rotations
		if (s1.length() != s2.length() || s1.length == 0) return false;

		String s1s1 = s1 + s1;
		return isSubstring(s1s1, s2);
	}
}