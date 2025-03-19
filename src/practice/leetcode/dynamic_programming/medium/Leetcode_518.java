package practice.leetcode.dynamic_programming.medium;

// Coin Change II
// https://leetcode.com/problems/coin-change-ii/description/

import java.util.Arrays;

public class Leetcode_518 {

    public static void main(String[] args) {
        System.out.println(change(5, new int[]{1,2,5} ));
    }

    public static int change(int amount, int[] coins) {
        int n = coins.length;
        Arrays.sort(coins);

        int[][] dp = new int[n + 1][amount + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 1;
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int a = 0; a <= amount; a++) {
                if (a >= coins[i]){
                    dp[i][a] = dp[i + 1][a];
                    dp[i][a] += dp[i][a - coins[i]];
                }
            }
        }

        return dp[0][amount];
    }


}
