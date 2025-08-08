package practice.leetcode.prefix_sum.medium;

// Make Sum Divisible by P
// https://leetcode.com/problems/make-sum-divisible-by-p/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_1590 {

    public static void main(String[] args) {
        System.out.println(minSubarray(new int[]{6,3,5,2}, 9));
        System.out.println(minSubarray(new int[]{3,1,4,2}, 6));
    }

    public static int minSubarray(int[] nums, int p) {
        int total = 0;

        for (int num : nums){
            total = (total + num) % p;
        }

        if (total % p == 0){
            return 0;
        }

        int target = total % p;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int prefix = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefix += (prefix + nums[i]) % p;
            int needed = (prefix - target + p) % p;

            if (map.containsKey(needed)){
                int prev = map.get(needed);
                minLen = Math.min(minLen, i - prev);
            }

            map.put(prefix, i);
        }

        return (minLen < nums.length) ? minLen : -1;
    }

}
