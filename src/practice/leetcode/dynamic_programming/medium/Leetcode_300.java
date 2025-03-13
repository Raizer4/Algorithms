package practice.leetcode.dynamic_programming.medium;

// Longest Increasing Subsequence
// https://leetcode.com/problems/longest-increasing-subsequence/description/


import java.util.Arrays;

public class Leetcode_300 {

    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }

    public static int lengthOfLIS(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);

        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = i; j < nums.length; j++) {
                if (nums[i] < nums[j]){
                    arr[i] = Math.max(arr[i], arr[j] + 1);
                }
            }
        }

        return Arrays.stream(arr).max().getAsInt();
    }

}

