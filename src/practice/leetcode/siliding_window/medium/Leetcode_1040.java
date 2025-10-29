package practice.leetcode.siliding_window.medium;

// Moving Stones Until Consecutive II
// https://leetcode.com/problems/moving-stones-until-consecutive-ii/description/

import java.util.Arrays;

public class Leetcode_1040 {

    public static void main(String[] args) {
        System.out.println(numMovesStonesII(new int[]{100,101,104,102,103}));
    }

    public static int[] numMovesStonesII(int[] stones) {
        Arrays.sort(stones);

        int n = stones.length;
        int r = 0;
        int max = 0;

        int high = Math.max(stones[n - 1] - n + 2 - stones[1], stones[n - 2] - stones[0] - n + 2);

        for (int l = 0; l < stones.length; l++) {
            int num = stones[l] + (n - 1);

            boolean flag = false;

            while (r < stones.length && stones[r] <= num){
                flag = true;
                r++;
            }

            if (flag){
                r--;
            }

            if (l == 0 && r == stones.length - 1){
                return new int[]{0, high};
            }

            int window = (r - l + 1);

            if (num - stones[r] == 1 && ((stones.length - 1) - r == 1 || l == 1)){
                continue;
            }

            max = Math.max(max, window);

            if (r == stones.length - 1){
                break;
            }
        }

        return new int[]{stones.length - max, high};
    }

}
