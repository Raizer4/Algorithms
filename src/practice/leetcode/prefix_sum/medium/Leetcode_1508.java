package practice.leetcode.prefix_sum.medium;

// Range Sum of Sorted Subarray Sums
// https://leetcode.com/problems/range-sum-of-sorted-subarray-sums/description/

import java.util.Arrays;

public class Leetcode_1508 {

    public static void main(String[] args) {
        System.out.println(rangeSum(new int[]{1,2,3,4}, 4, 3, 4));
    }

    public static int rangeSum(int[] nums, int n, int left, int right) {
        long[] ints = new long[n * (n + 1) / 2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            long sum = 0;

            for (int j = i; j < n; j++) {
                sum += nums[j];
                ints[index++] = sum;
            }
        }

        Arrays.sort(ints);

        long[] prefix = new long[ints.length + 1];

        for (int i = 0; i < ints.length; i++) {
            prefix[i + 1] = prefix[i] + ints[i];
        }

        return (int) ((prefix[right] - prefix[left - 1]) % 1_000_000_007);
    }

}
