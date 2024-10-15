package practice.leetcode.array.easy;

// Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class Leetcode_121 {

    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{7,1,5,3,6,4}));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0){
            return 0;
        }

        int minPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++){

            if (prices[i] < minPrice){
                minPrice = prices[i];
            }

            int temp = prices[i] - minPrice;

            if (profit < temp){
                profit = temp;
            }

        }

        return profit;
    }

}
