package practice.leetcode.leetcode_75.decision.day_7;

// Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_238 {

    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{1,2,3,4});

        for (int temp : ints){
            System.out.println(temp + " ");
        }

    }

    public static int[] productExceptSelf(int[] nums) {
        int[] ints = new int[nums.length];
        int right = 1;

        for (int i = 0; i < nums.length; i++){
            ints[i] = right;
            right *= nums[i];
        }

        int left = 1;

       for (int i = nums.length - 1; i >= 0; i--){
            ints[i] = ints[i] * left;
            left *= nums[i];
       }

       return ints;
    }

}
