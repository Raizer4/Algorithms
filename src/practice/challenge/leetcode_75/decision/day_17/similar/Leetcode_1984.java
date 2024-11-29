package practice.challenge.leetcode_75.decision.day_17.similar;

// Minimum Difference Between Highest and Lowest of K Scores
// https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/description/

import java.util.Arrays;


public class Leetcode_1984 {

    public static void main(String[] args) {
        System.out.println(minimumDifference(new int[]{9,4,1,7},2));
        System.out.println(minimumDifference(new int[]{87063,61094,44530,21297,95857,93551,9918},6));
    }

    public static int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;

        Arrays.sort(nums);
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i <= nums.length - k; i++) {
            int difference = nums[i + k - 1] - nums[i];
            minDifference = Math.min(minDifference, difference);
        }

        return minDifference;
    }

}
