package practice.leetcode.prefix_sum.medium;

// Subarray Sums Divisible by K
// https://leetcode.com/problems/subarray-sums-divisible-by-k/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_974 {

    public static void main(String[] args) {
        System.out.println(subarraysDivByK(new int[]{4,5,0,-2,-3,1}, 5));
    }

    public static int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0;
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];

            int temp = (prefix % k + k) % k;

            if (map.containsKey(temp)){
                answer += map.get(temp);
            }

            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        return answer;
    }

}
