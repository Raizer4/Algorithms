package practice.leetcode.dynamic_programming.medium;

// Best Time to Buy and Sell Stock with Transaction Fee
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.HashMap;
import java.util.Map;

public class Leetcode_714 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,3,2,8,4,9}, 2));
    }

    private static Map<String, Integer> dp = new HashMap<>();

    public static int maxProfit(int[] prices, int fee) {
        return dfs(0,true, prices, fee);
    }

    private static int dfs(int i, boolean buying, int[] prices, int fee){
        if (i >= prices.length){
            return 0;
        }

        String key = i + "-" + buying;
        if (dp.containsKey(key)){
            return dp.get(key);
        }

        int cooldown = dfs(i + 1, buying, prices, fee);

        if (buying){
            int buy = dfs(i + 1, false, prices, fee) - prices[i];
            dp.put(key, Math.max(buy,cooldown));
        }else {
            int sell = dfs(i + 1, true, prices, fee) + prices[i];
            dp.put(key, Math.max(sell - fee, cooldown));
        }

        return dp.get(key);
    }

}
