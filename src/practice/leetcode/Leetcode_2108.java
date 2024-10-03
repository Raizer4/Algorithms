package practice.leetcode;

// Find First Palindromic String in the Array
// https://leetcode.com/problems/find-first-palindromic-string-in-the-array/description/

public class Leetcode_2108 {

    public static void main(String[] args) {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));
    }

    public static String firstPalindrome(String[] words) {
        for (String string : words){
            int i = 0;
            int j = string.length() - 1;
            boolean flag = true;
            
            while (i < j){
                char c = string.charAt(i);
                char g = string.charAt(j);

                if (!Character.isLetterOrDigit(c)){
                    i++;
                    continue;
                }

                if (!Character.isLetterOrDigit(g)){
                    j--;
                    continue;
                }

                if (c != g){
                    flag = false;
                    break;
                }

                i++;
                j--;
            }
            if (flag) {
                return string;
            }
        }
        return "";
    }


}
