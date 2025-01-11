package practice.leetcode.array.easy;

// Array Partition
// https://leetcode.com/problems/array-partition/description/

import java.util.Arrays;

public class Leetcode_561 {

    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[]{
                6,2,6,5,1,2
        }));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int k = nums.length / 2;
        int index = 0;
        int result = 0;

        while (k != 0){
            result += nums[index];
            k--;
            index += 2;
        }
        return result;
    }

}
