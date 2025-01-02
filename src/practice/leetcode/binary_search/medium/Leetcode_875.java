package practice.leetcode.binary_search.medium;

// Koko Eating Bananas
// https://leetcode.com/problems/koko-eating-bananas/description/

import java.util.Arrays;

public class Leetcode_875 {

    public static void main(String[] args) {
        System.out.println(minEatingSpeed(new int[]{3,6,7,11}, 8));
    }

    public static int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);

        int l = 1;
        int r = piles[piles.length - 1];

        int res = 0;

        while (l <= r){
            int m = (l + r) / 2 ;

            int count = 0;

            for (int temp : piles){
                count += Math.ceil((double) temp / m);
            }

            if (count <= h){
                res = m;
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return res;
    }



}
