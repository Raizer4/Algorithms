package practice.leetcode.binary_search.medium;

// Capacity To Ship Packages Within D Days
// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/

public class Leetcode_1011 {

    public static void main(String[] args) {
        System.out.println(shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
    }

    public static int shipWithinDays(int[] weights, int days) {
        int l = 0, r = 0;

        for (int w : weights){
            l = Math.max(l, w);
            r += w;
        }

        int res = r;

        while (l <= r){
            int cap = (l + r) / 2;

            if (canShip(weights, days, cap)){
                res = Math.min(res, cap);
                r = cap - 1;
            }else {
                l = cap + 1;
            }
        }

        return res;
    }

    private static boolean canShip(int[] weights, int days, int cap){
        int ships = 1, currCap = cap;

        for (int w : weights){
            if (currCap - w < 0){
                ships++;
                if (ships > days){
                    return false;
                }
                currCap = cap;
            }
            currCap -= w;
        }

        return true;
    }


}
