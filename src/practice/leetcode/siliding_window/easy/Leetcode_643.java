package practice.leetcode.siliding_window.easy;

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
        double tempMax = 0;

        for (int i = 0; i < k; i++){
            tempMax += nums[i];
        }

        double max = tempMax;

        for (int r = k; r < nums.length; r++){
            tempMax -= nums[r - k];
            tempMax += nums[r];
            max = Math.max(max,tempMax);
        }

        return max / k;
    }



}
