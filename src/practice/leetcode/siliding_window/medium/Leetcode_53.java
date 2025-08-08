package practice.leetcode.siliding_window.medium;

// Maximum Subarray
// https://leetcode.com/problems/maximum-subarray/description/

import java.util.Stack;

public class Leetcode_53 {

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        Stack<int[]> stack = new Stack<>();

        stack.add(new int[]{nums[0], 0, 0});

        int max = nums[0];


        for (int i = 1; i < nums.length; i++) {
            int[] peek = stack.peek();
            int temp = peek[0] + nums[i];

            if (temp > nums[i]){
                if (temp > max){
                    max = temp;
                }

                stack.add(new int[]{temp});
            }else {
                if (nums[i] > max){
                    max = nums[i];
                }

                stack.add(new int[]{nums[i]});
            }

        }

        return max;
    }

}
