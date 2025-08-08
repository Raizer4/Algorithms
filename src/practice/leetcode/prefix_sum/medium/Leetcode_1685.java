package practice.leetcode.prefix_sum.medium;

// Sum of Absolute Differences in a Sorted Array
// https://leetcode.com/problems/sum-of-absolute-differences-in-a-sorted-array/description/

public class Leetcode_1685 {

    public static void main(String[] args) {
        int[] sumAbsoluteDifferences = getSumAbsoluteDifferences(new int[]{1, 4, 6, 8, 10});

        for (int temp : sumAbsoluteDifferences){
            System.out.print(temp + " ");
        }

    }

    public static int[] getSumAbsoluteDifferences(int[] nums) {
        int[] arr = new int[nums.length + 1];

        for (int i = 1; i <= nums.length; i++) {
           arr[i] = nums[i - 1] + arr[i - 1];
        }

        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
           res[i] = (nums[i] * i - arr[i]) + ((arr[nums.length] - arr[i + 1]) - nums[i] * (nums.length - i - 1));
        }

        return res;
    }

}
