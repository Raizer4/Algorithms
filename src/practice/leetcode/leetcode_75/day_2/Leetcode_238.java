package practice.leetcode.leetcode_75.day_2;

// Product of Array Except Self
// https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_238 {

    public static void main(String[] args) {
        int[] ints = productExceptSelf(new int[]{1, 2, 3, 4});

        for (int temp : ints){
            System.out.println(temp + " ");
        }

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];


        result[0] = 1;

        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }


        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {
            result[i] = result[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

}
