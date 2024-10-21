package practice.leetcode.array.easy;

// Squares of a Sorted Array
// https://leetcode.com/problems/squares-of-a-sorted-array/description/

import java.util.Arrays;

public class Leetcode_977 {

    public static void main(String[] args) {
        System.out.println(sortedSquares(new int[]{-4,-1,0,3,10}));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            res[i] = (int) Math.pow(Math.abs(nums[i]),2);
        }

        Arrays.sort(res);

        return res;
    }

}
