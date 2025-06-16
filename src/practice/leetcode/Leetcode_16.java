package practice.leetcode;

// 3Sum Closest
// https://leetcode.com/problems/3sum-closest/description/

import java.util.Arrays;

public class Leetcode_16 {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{4,0,5,-5,3,3,0,-4,-5}, -2));
    }

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int res = Integer.MAX_VALUE;
        int temp = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int l = i + 1;
            int r = nums.length - 1;

            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                int abs = Math.abs(target - sum);

                if (abs < res){
                    res = abs;
                    temp = sum;
                }

                if (sum == target){
                    return target;
                }else if (sum < target){
                    l++;
                }else {
                    r--;
                }

            }

        }

        return temp;
    }

}
