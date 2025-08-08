package practice.leetcode.two_pointers.medium;

// Maximize Greatness of an Array
// https://leetcode.com/problems/maximize-greatness-of-an-array/description/

import java.util.Arrays;


public class Leetcode_2592 {

    public static void main(String[] args) {
        System.out.println(maximizeGreatness(new int[]{1,3,5,2,1,3,1}));
    }

    public static int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);

        int l = nums.length - 2;
        int r = nums.length - 1;

        int count = 0;

        while (l >= 0) {
            if (nums[r] > nums[l]) {
                count++;
                r--;
            }

            l--;
        }

        return count;
    }


}
