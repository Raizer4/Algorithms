package practice.leetcode.dynamic_programming.medium;

// House Robber II
// https://leetcode.com/problems/house-robber-ii/description/

import java.util.Arrays;

public class Leetcode_213 {

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,2,3,1}));
    }

    public static int rob(int[] nums) {
        if (nums.length == 1){
            return nums[0];
        }

        return Math.max(generated(Arrays.copyOfRange(nums, 1, nums.length)), generated(Arrays.copyOf(nums, nums.length - 1)));
    }

    private static int generated(int[] arr){
        if (arr.length == 1){
            return arr[0];
        }

        int n = arr.length;

        int[] temp = new int[n];
        temp[0] = arr[0];
        temp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            temp[i] = Math.max(temp[i - 1], arr[i] + temp[i - 2]);
        }

        return temp[n - 1];
    }

}
