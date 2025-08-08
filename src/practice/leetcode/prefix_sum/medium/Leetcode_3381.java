package practice.leetcode.prefix_sum.medium;

// Maximum Subarray Sum With Length Divisible by K
// https://leetcode.com/problems/maximum-subarray-sum-with-length-divisible-by-k/description/

import java.util.HashMap;

public class Leetcode_3381 {

    public static void main(String[] args) {
        System.out.println(maxSubarraySum(new int[]{-5,1,2,-3,4}, 2));
    }

    public static long maxSubarraySum(int[] nums, int k) {
        HashMap<Long, Long> map = new HashMap<>();
        map.put(0L, 0L);

        long prefix = 0;
        long max = Long.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            long temp = (i + 1) % k;

            if (map.containsKey(temp)){
                long sum = prefix - map.get(temp);
                if (sum > max) {
                    max = sum;
                }

                if (map.get(temp) > prefix) {
                    map.put(temp, prefix);
                }

            }else {
                map.put(temp, prefix);
            }

        }

        return max;
    }

}
