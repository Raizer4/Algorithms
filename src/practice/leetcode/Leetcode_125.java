package practice.leetcode;

// Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description/

public class Leetcode_125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
    }

    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }

        int start = 0;
        int last = s.length() - 1;

        while(start <= last) {
            char currFirst = s.charAt(start);
            char currLast = s.charAt(last);

            if (!Character.isLetterOrDigit(currFirst)) {
                start++;
            } else if(!Character.isLetterOrDigit(currLast)) {
                last--;
            } else {
                if (Character.toLowerCase(currFirst) != Character.toLowerCase(currLast)) {
                    return false;
                }
                start++;
                last--;
            }

        }

        return true;
    }

}