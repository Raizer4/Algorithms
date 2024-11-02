package practice.leetcode.leetcode_75.decision.day_13.similar;

// Largest Positive Integer That Exists With Its Negative
// https://leetcode.com/problems/largest-positive-integer-that-exists-with-its-negative/description/

import java.util.Arrays;

public class Leetcode_2441 {

    public static void main(String[] args) {
        System.out.println(findMaxK(new int[]{-1,2,-3,3}));
        System.out.println(findMaxK(new int[]{-1,10,6,7,-7,1}));
        System.out.println(findMaxK(new int[]{-10,8,6,7,-2,-3}));
    }

    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;

        while (i < j){
            if (nums[i] < 0 && nums[j] > 0){
                if (Math.abs(nums[i]) == nums[j]){
                    return nums[j];
                }else if (Math.abs(nums[i]) < nums[j]){
                    j--;
                }else {
                    i++;
                }
            }else {
                break;
            }
        }

        return -1;
    }

}
