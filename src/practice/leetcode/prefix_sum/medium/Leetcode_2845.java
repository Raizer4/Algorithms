package practice.leetcode.prefix_sum.medium;

// Count of Interesting Subarrays
// https://leetcode.com/problems/count-of-interesting-subarrays/description/

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_2845 {

    public static void main(String[] args) {
        System.out.println(countInterestingSubarrays(Arrays.asList(3,2,4), 2, 1));
        System.out.println(countInterestingSubarrays(Arrays.asList(3,1,9,6), 3, 0));
    }

    public static long countInterestingSubarrays(List<Integer> nums, int modulo, int k) {
        int[] prefix = new int[nums.size() + 1];

        for (int i = 0; i < nums.size(); i++) {
            prefix[i + 1] = prefix[i] + (nums.get(i) % modulo == k ? 1 : 0);
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        long result = 0;

        for (int i = 1; i <= nums.size(); i++) {
            int current = prefix[i] % modulo;
            int needed = (current - k + modulo) % modulo;

            result += map.getOrDefault(needed, 0);

            map.put(current, map.getOrDefault(current, 0) + 1);
        }

        return result;
    }

}
