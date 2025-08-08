package practice.leetcode.binary_search.medium;

// Frog Jump II
// https://leetcode.com/problems/frog-jump-ii/description/

import java.util.HashSet;
import java.util.Set;

public class Leetcode_2498 {

    public static void main(String[] args) {
        System.out.println(maxJump(new int[]{0,3,9}));
    }

    public static int maxJump(int[] stones) {
        int l = stones[0];
        int r = stones[stones.length - 1];

        int res = 0;

        while (l <= r){
            int m = l + (r - l) / 2;

            boolean flag = summing(stones, m);

            if (flag){
                res = m;
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return res;
    }

    private static boolean summing(int[] stones, int target) {
        int temp = stones[0];
        int i = 1;

        Set<Integer> set = new HashSet<>();

        while (temp != stones[stones.length - 1]){
            int max = temp + target;
            int num = temp;

            while (i < stones.length && stones[i] <= max) {
                num = stones[i];
                i++;
            }

            if (num == temp){
                return false;
            }

            temp = num;

            if (temp != stones[stones.length - 1]){
                set.add(temp);
            }
        }

        temp = stones[stones.length - 1];
        i = stones.length - 2;

        while (temp != stones[0]){
            int num = temp;

            while (i >= 0 && Math.abs(stones[i] - temp) <= target){
                if (!set.contains(stones[i])){
                    num = stones[i];
                }
                i--;
            }

            if (num == temp){
                return false;
            }

            temp = num;
        }


        return true;
    }


}
