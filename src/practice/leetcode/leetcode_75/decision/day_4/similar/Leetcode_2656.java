package practice.leetcode.leetcode_75.decision.day_4.similar;

// Maximum Sum With Exactly K Elements
// https://leetcode.com/problems/maximum-sum-with-exactly-k-elements/description/


import java.util.Arrays;

public class Leetcode_2656 {

    public static void main(String[] args) {
        System.out.println(maximizeSum(new int[]{5,5,5},2));
    }

    public static int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);
        int m = 0;

        for (int i = 0; i < k; i++) {
            m += nums[nums.length - 1];
            nums[nums.length - 1] = ++nums[nums.length - 1];
        }

        return m;
    }

}
