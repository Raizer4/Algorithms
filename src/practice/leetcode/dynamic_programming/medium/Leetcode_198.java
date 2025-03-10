package practice.leetcode.dynamic_programming.medium;

// House Robber
// https://leetcode.com/problems/house-robber/description/

public class Leetcode_198 {

    public static void main(String[] args) {
        System.out.println(rob(new int[]{1,24,5,2}));
    }

    public static int rob(int[] nums) {
        int n = nums.length;

        if (n == 1){
            return nums[0];
        }

        int[] arr = new int[n];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            arr[i] = Math.max(arr[i - 1], arr[i] + arr[i - 2]);
        }

        return arr[n - 1];
    }

}
