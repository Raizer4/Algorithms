package practice.leetcode.dynamic_programming.medium;

// Longest Palindromic Substring
// https://leetcode.com/problems/longest-palindromic-substring/description/

public class Leetcode_5 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("abba"));
    }

    public static String longestPalindrome(String s) {
        int n = s.length();
        int index = 0 , length = 0;
        boolean[][] visited = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (2 >= (j - i) || visited[i + 1][j - 1])){
                    visited[i][j] = true;

                    if (length < (j - i + 1) ){
                        length = j - i + 1;
                        index = i;
                    }

                }
            }
        }

        return s.substring(index, index + length);
    }

}
