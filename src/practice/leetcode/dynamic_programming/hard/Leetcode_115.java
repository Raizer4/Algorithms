package practice.leetcode.dynamic_programming.hard;

// Distinct Subsequences
// https://leetcode.com/problems/distinct-subsequences/description/

public class Leetcode_115 {

    public static void main(String[] args) {
        System.out.println(numDistinct("rabbbit", "rabbit"));
    }

    public static int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                dp[i][j] = dp[i + 1][j];

                if (s.charAt(i) == t.charAt(j)){
                    dp[i][j] += dp[i + 1][j + 1];
                }

            }
        }

        return dp[0][0];
    }

}
