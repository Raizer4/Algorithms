package practice.leetcode.bit_manipulation.easy;

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
        int res = 0;

        for (int temp : nums){
            res ^= temp;
        }

        return res;
    }

}
