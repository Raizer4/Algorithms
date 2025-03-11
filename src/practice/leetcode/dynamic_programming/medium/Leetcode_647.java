package practice.leetcode.dynamic_programming.medium;

// Palindromic Substrings
// https://leetcode.com/problems/palindromic-substrings/description/

public class Leetcode_647 {

    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));
        System.out.println(countSubstrings("aaa"));
    }

    public static int countSubstrings(String s) {
        int n = s.length();
        int count = 0;

        boolean[][] bp = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) && (2 >= (j - i) || bp[i + 1][j - 1])){
                    bp[i][j] = true;
                    count++;
                }
            }
        }


        return count;
    }

}

