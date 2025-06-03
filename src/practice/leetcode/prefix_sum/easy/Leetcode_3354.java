package practice.leetcode.prefix_sum.easy;

// Make Array Elements Equal to Zero
// https://leetcode.com/problems/make-array-elements-equal-to-zero/description/

import java.util.Arrays;

public class Leetcode_3354 {

    public static void main(String[] args) {
        System.out.println(countValidSelections(new int[]{16,0,0,12,5}));
    }

    public static int countValidSelections(int[] nums) {
        int[] arr = new int[nums.length];

        int sum_1 = 0;

        Arrays.fill(arr, -10);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                arr[i] = sum_1;
            }else {
                sum_1 += nums[i];
            }
        }

        int sum_2 = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0){
                arr[i] -= sum_2;
            }else {
                sum_2 += nums[i];
            }
        }

        int res = 0;

        for (int temp : arr){
            if (temp == 0){
                res += 2;
            } else if (Math.abs(temp) == 1) {
                res += 1;
            }
        }

        return res;
    }

}
