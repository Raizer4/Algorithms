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
        int r = Arrays.stream(piles).max().getAsInt();

        int response = -1;

        while (l <= r){
            int m = (l + r) / 2;
            long ceil = 0;

            for (int p : piles){
                ceil += Math.ceil((double) p / m);
            }

            if (ceil > h){
                l = m + 1;
            }else {
                response = m;
                r = m - 1;
            }
        }

        return response;
    }



}
