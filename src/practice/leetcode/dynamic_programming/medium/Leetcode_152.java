package practice.leetcode.dynamic_programming.medium;

// Maximum Product Subarray
// https://leetcode.com/problems/maximum-product-subarray/description/

public class Leetcode_152 {

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));
    }

    public static int maxProduct(int[] nums) {
        int res = nums[0];
        int curMin = 1, curMax = 1;

        for (int num : nums) {
            int tmp = curMax * num;
            curMax = Math.max(Math.max(num * curMax, num * curMin), num);
            curMin = Math.min(Math.min(tmp, num * curMin), num);
            res = Math.max(res, curMax);
        }

        return res;
    }

}
