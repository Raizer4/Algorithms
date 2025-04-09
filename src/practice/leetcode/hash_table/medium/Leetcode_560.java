package practice.leetcode.hash_table.medium;

// Subarray Sum Equals K
// https://leetcode.com/problems/subarray-sum-equals-k/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_560 {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1}, 2));
        System.out.println(subarraySum(new int[]{1,2,3}, 3));
    }

    public static int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);

        int count = 0;
        int currentSum = 0;

        for (int num : nums){
            currentSum += num;
            count += prefixSumCount.getOrDefault(currentSum - k, 0);
            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum, 0) + 1);
        }

        return count;
    }

}
