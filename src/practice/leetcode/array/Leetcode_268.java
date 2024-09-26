package practice.leetcode.array;

// Missing Number
// https://leetcode.com/problems/missing-number/description/

import java.util.Arrays;


public class Leetcode_268 {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums[nums.length-1]; i++){
            if (nums[i] != i){
                return i;
            }
        }

        return nums[nums.length - 1] + 1;
    }

}
