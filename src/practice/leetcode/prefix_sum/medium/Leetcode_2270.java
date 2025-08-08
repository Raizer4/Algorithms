package practice.leetcode.prefix_sum.medium;

// Number of Ways to Split Array
// https://leetcode.com/problems/number-of-ways-to-split-array/description/

public class Leetcode_2270 {

    public static void main(String[] args) {
        System.out.println(waysToSplitArray(new int[]{10,4,-8,7}));
    }

    public static int waysToSplitArray(int[] nums) {
        long[] prefix = new long[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long count = 0;

        for (int i = 1; i < prefix.length - 1; i++) {
            if (prefix[i] >= (prefix[prefix.length - 1] - prefix[i])){
                count++;
            }
        }

        return (int) count;
    }

}
