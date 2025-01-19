package practice.leetcode.siliding_window.easy;

// Longest Harmonious Subsequence
// https://leetcode.com/problems/longest-harmonious-subsequence/description/

import java.util.*;

public class Leetcode_594 {

    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        System.out.println(findLHS(new int[]{1,1,1,1}));
    }

    public static int findLHS(int[] nums) {
        Arrays.sort(nums);

        int l = 0;
        int max = 0;

        for (int r = 0; r < nums.length; r++) {
            while (nums[r] - nums[l] > 1){
                l++;
            }

            if (nums[r] - nums[l] == 1){
                max = Math.max(max,r - l + 1);
            }
        }

        return max;
    }

}
