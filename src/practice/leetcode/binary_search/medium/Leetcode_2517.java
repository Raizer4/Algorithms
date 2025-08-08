package practice.leetcode.binary_search.medium;

// Maximum Tastiness of Candy Basket
// https://leetcode.com/problems/maximum-tastiness-of-candy-basket/description/

import java.util.Arrays;

public class Leetcode_2517 {

    public static void main(String[] args) {
        System.out.println(maximumTastiness(new int[]
                        {34,116,83,15,150,56,69,42,26}, 6));
    }

    public static int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);

        int l = 0;
        int r = price[price.length - 1] - price[0];

        int total = 0;

        while (l <= r){
            int m = l + (r - l) / 2;
            int count = 1;
            int last = price[0];

            for (int i = 1; i < price.length; i++) {
                if (price[i] - last >= m){
                    count++;
                    last = price[i];
                    if (count >= k){
                        break;
                    }
                }
            }

            if (count >= k){
                total = m;
                l = m + 1;
            }else if (count < k){
                r = m - 1;
            }
        }


        return total;
    }

}
