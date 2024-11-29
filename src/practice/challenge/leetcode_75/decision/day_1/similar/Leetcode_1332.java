package practice.challenge.leetcode_75.decision.day_1.similar;

// Remove Palindromic Subsequences
// https://leetcode.com/problems/remove-palindromic-subsequences/description/

public class Leetcode_1332 {

    public static void main(String[] args) {
        System.out.println(removePalindromeSub("ababa"));
        System.out.println(removePalindromeSub("abb"));
        System.out.println(removePalindromeSub("baabb"));
        System.out.println(removePalindromeSub("bbaabaaa"));
    }

    public static int removePalindromeSub(String s) {
        StringBuilder builder = new StringBuilder(s);

        if (isPalindrome(builder.toString())) {
            return 1;
        }else {
            return 2;
        }

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
