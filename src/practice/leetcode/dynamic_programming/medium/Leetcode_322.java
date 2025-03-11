package practice.leetcode.dynamic_programming.medium;

// Coin Change
// https://leetcode.com/problems/coin-change/description/

import java.util.HashMap;

public class Leetcode_322 {

    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5}, 11));
    }

    private static HashMap<Integer,Integer> memo = new HashMap<>();

    public static int coinChange(int[] coins, int amount) {
        int minCoins = dfs(amount,coins);
        return minCoins == Integer.MAX_VALUE ? -1 : minCoins;
    }

    public static int dfs(int amount, int[] coins){
        if (amount == 0){return 0;}
        if (memo.containsKey(amount)){
            return memo.get(amount);
        }

        int res = Integer.MAX_VALUE;

        for (int coin : coins){
            if (amount - coin >= 0){
                int result = dfs(amount - coin, coins);
                if (result != Integer.MAX_VALUE){
                    res = Math.min(res, 1 + result);
                }
            }
        }

        memo.put(amount,res);
        return res;
    }

}
