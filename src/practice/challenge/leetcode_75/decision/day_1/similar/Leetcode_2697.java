package practice.challenge.leetcode_75.decision.day_1.similar;

// Lexicographically Smallest Palindrome
// https://leetcode.com/problems/lexicographically-smallest-palindrome/description/

public class Leetcode_2697 {

    public static void main(String[] args) {
        System.out.println(makeSmallestPalindrome("egcfe"));
    }

    public static String makeSmallestPalindrome(String s) {
        StringBuilder builder = new StringBuilder(s);

        int i = 0;
        int j = builder.length() - 1;

        while (i < j){
            if (builder.charAt(i) != builder.charAt(j)){
                int a = builder.charAt(i);
                int b = builder.charAt(j);
                if (a > b){
                   builder.setCharAt(i,builder.charAt(j));
               }else {
                   builder.setCharAt(j,builder.charAt(i));
               }
            }
            i++;
            j--;
        }

        return builder.toString();
    }



}
