package practice.leetcode.array.medium;

// Best Time to Buy and Sell Stock II
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

public class Leetcode_122 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1,2,4,5,6}));
    }

    public static int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        return profit;
    }

}
