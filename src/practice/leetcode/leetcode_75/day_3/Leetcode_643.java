package practice.leetcode.leetcode_75.day_3;

// Maximum Average Subarray I
// https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_643 {

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1,12,-5,-6,50,3},4));
        System.out.println(findMaxAverage(new int[]{5},1));
        System.out.println(findMaxAverage(new int[]{9,7,3,5,6,2,0,8,1,9},5));
    }

    public static double findMaxAverage(int[] nums, int k) {
        double maxSum = 0;

        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        double currentSum = maxSum;


        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }


        return maxSum / k;
    }

}
