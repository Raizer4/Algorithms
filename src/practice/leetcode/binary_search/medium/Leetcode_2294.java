package practice.leetcode.binary_search.medium;

// Partition Array Such That Maximum Difference Is K
// https://leetcode.com/problems/partition-array-such-that-maximum-difference-is-k/description/

import java.util.Arrays;

public class Leetcode_2294 {

    public static void main(String[] args) {
        System.out.println(partitionArray(new int[]{3,6,1,2,5}, 2));
    }

    public static int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 1;

        int count = 1;

        while (l < nums.length - 1){
            r = binary(nums, nums[l] + k);

            if (r == nums.length -1){
                break;
            }

            count++;
            l = r + 1;
        }

        return count;
    }

    private static int binary(int[] nums, int num){
        int l = 0;
        int r = nums.length - 1;

        int index = -1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (nums[m] > num){
                r = m - 1;
            }else {
                index = m;
                l = m + 1;
            }

        }

        return index;
    }

}
