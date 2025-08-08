package practice.leetcode.two_pointers.medium;

// Number of Subsequences That Satisfy the Given Sum Condition
// https://leetcode.com/problems/number-of-subsequences-that-satisfy-the-given-sum-condition/description/

import java.util.Arrays;

public class Leetcode_1498 {

    public static void main(String[] args) {
        System.out.println(numSubseq(new int[]{3,5,6,7}, 9));
        System.out.println(numSubseq(new int[]{3,3,6,8}, 10));
        System.out.println(numSubseq(new int[]{2,3,3,4,6,7}, 12));
    }

    public static int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int MOD = 1_000_000_007;

        int[] pow = new int[nums.length];
        pow[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            pow[i] = (pow[i - 1] * 2) % MOD;
        }

        int res = 0;

        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            if (nums[l] + nums[r] <= target){
                res = (res + pow[r - l]) % MOD;
                l++;
            }else {
                r--;
            }
        }

        return res;
    }

}
