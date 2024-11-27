package practice.leetcode.leetcode_75.decision.day_14;

// Maximum Average Subarray I
// https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_643 {

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
        System.out.println(findMaxAverage(new int[]{5},1));
        System.out.println(findMaxAverage(new int[]{9,7,3,5,6,2,0,8,1,9},5));
        System.out.println(findMaxAverage(new int[]{-1},1));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double max = 0;

        for (int i = 0; i < k; i++) {
            max += nums[i];
        }

        double current = max;

        for (int i = k; i < nums.length; i++) {
            current += nums[i] - nums[i - k];
            max = Math.max(current,max);
        }

        return max / k;
    }



}
