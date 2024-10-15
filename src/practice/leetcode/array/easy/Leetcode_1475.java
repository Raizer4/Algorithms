package practice.leetcode.array.easy;

// Final Prices With a Special Discount in a Shop
// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/description/

public class Leetcode_1475 {

    public static void main(String[] args) {
        int[] ints = finalPrices(finalPrices(new int[]{8, 4, 6, 2, 3}));

        for (int temp : ints){
            System.out.println(temp);
        }

    }

    public static int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        boolean flag;

        for (int i = 0; i < prices.length -1; i++){
            flag = true;

            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] <= prices[i]){
                    result[i] = prices[i] - prices[j];
                    flag = false;
                    break;
                }
            }

            if (flag){
                result[i] = prices[i];
            }

        }

        result[result.length -1] = prices[prices.length - 1];

        return result;
    }

}
