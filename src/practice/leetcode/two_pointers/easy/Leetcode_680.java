package practice.leetcode.two_pointers.easy;

// Valid Palindrome II
// https://leetcode.com/problems/valid-palindrome-ii/description/


public class Leetcode_680 {

    public static void main(String[] args) {
        System.out.println(validPalindrome("cbbcc"));
        System.out.println(validPalindrome("abca"));
        System.out.println(validPalindrome("abc"));
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                StringBuilder builder_1 = new StringBuilder(s);
                StringBuilder builder_2 = new StringBuilder(s);
                builder_1.deleteCharAt(i);
                builder_2.deleteCharAt(j);

                if (isPalindrome(builder_1.toString()) || isPalindrome(builder_2.toString())){
                    return true;
                }else{
                     return false;
                }

            }
            i++;
            j--;
        }

        return true;
    }


    private static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;

        while (i < j){
            if (s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }

}
