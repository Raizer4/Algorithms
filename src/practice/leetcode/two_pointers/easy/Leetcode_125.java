package practice.leetcode.two_pointers.easy;

// Valid Palindrome
// https://leetcode.com/problems/valid-palindrome/description/

public class Leetcode_125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(".,"));
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j){

            if (!Character.isLetterOrDigit(s.charAt(i))){
                i++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(j))){
                j--;
                continue;
            }

            if(Character.toLowerCase(s.charAt(i))!= Character.toLowerCase(s.charAt(j))){
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

}
