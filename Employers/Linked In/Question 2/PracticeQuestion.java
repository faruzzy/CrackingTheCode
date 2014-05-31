public class PracticeQuestion {

    public static void main(String[] args) {
        String first = "racecar";
        String two = "caac";
        String three = "caacracecar";
        System.out.println("The longest palindrome is: " + longestPalindrome(first));
        System.out.println("The longest palindrome is: " + longestPalindrome(two));
        System.out.println("The longest palindrome is: " + longestPalindrome(three));
    }

    public static String longestPalindrome(String str) {
        if (str.length() == 1) return str;

        String longest = str.substring(0, 1);
        for (int i = 0; i < str.length(); i++) {
            String tmp = helper(str, i, i);
            if (tmp.length() > longest.length()) longest = tmp;

            tmp = helper(str, i, i+1);
            if (tmp.length() > longest.length()) longest = tmp;
        }
        return longest;
    }


    // Given a center find longest palindrome
    public static String helper(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() - 1
                && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }
        return s.substring(begin + 1, end);
    }

}

