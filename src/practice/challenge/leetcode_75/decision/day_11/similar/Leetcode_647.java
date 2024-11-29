package practice.challenge.leetcode_75.decision.day_11.similar;

// Palindromic Substrings
// https://leetcode.com/problems/palindromic-substrings/description/

public class Leetcode_647 {

    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
        System.out.println(countSubstrings("aaa"));
    }

    public static int countSubstrings(String s) {
        int count = s.length();

        int size = 2;

        int end;
        int start;

        while (size <= s.length()){
            end = size;
            start = 0;

            while (end <= s.length()){
                if (isPalindrome(s.substring(start, end))){
                    count++;
                }
                start++;
                end++;
            }

            size++;
        }

        return count;
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

