package practice.leetcode.siliding_window.easy;

// Maximum Strong Pair XOR I
// https://leetcode.com/problems/maximum-strong-pair-xor-i/description/

import java.util.Arrays;

public class Leetcode_2932 {

    public static void main(String[] args) {
        System.out.println(maximumStrongPairXor(new int[]{1,2,3,4,5}));
    }

    public static int maximumStrongPairXor(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int j = i;

            while (j < n && nums[j] - x <= x){
                max = Math.max(max, x ^ nums[j]);
                j++;
            }

        }

        return max;
    }


}
