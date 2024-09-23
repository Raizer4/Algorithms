package practice.leetcode.leetcode_75.day_5;

// Single Number
// https://leetcode.com/problems/single-number/description/

import java.util.Arrays;
import java.util.Stack;

public class Leetcode_136 {

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2,2,1}));
        System.out.println(singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(singleNumber(new int[]{1}));
    }

    public static int singleNumber(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            if (!stack.contains(nums[i])){
                 stack.push(nums[i]);
            }else {
                stack.pop();
            }
        }


        return stack.pop();
    }

}
