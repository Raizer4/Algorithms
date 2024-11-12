package practice.leetcode.leetcode_75.decision.day_7;

// Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75


import java.util.ArrayList;
import java.util.List;

public class Leetcode_238 {

    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{1,2,3,4});

        for (int temp : ints){
            System.out.println(temp + " ");
        }

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        int left = 1;

        for (int i = 0; i < nums.length; i++) {
            res[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }

        return res;
    }

}
