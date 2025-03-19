package practice.leetcode.dynamic_programming.medium;

// Best Time to Buy and Sell Stock with Cooldown
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_309 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2, 3, 0, 2}));
    }

    private static Map<String, Integer> dp = new HashMap<>();

    public static int maxProfit(int[] prices){
        return dfs(0, true, prices);
    }

    private static int dfs(int i, boolean buying, int[] prices){
        if (i >= prices.length){
            return 0;
        }

        String key = i + "-" + buying;

        if (dp.containsKey(key)){
            return dp.get(key);
        }

        int cooldown = dfs(i + 1, buying, prices);

        if (buying){
            int buy = dfs(i + 1, false, prices) - prices[i];
            dp.put(key,Math.max(buy, cooldown));
        }else {
            int sell = dfs(i + 2, true, prices) + prices[i];
            dp.put(key,Math.max(sell, cooldown));
        }

        return dp.get(key);
    }

}
