package practice.leetcode.prefix_sum.medium;

// Continuous Subarray Sum
// https://leetcode.com/problems/continuous-subarray-sum/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_523 {

    public static void main(String[] args) {
        System.out.println(checkSubarraySum(new int[]{1,0}, 2));
    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);

        int prefix = 0;

        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            int temp = (prefix % k + k) % k;

            if (map.containsKey(temp)){
                if (i - map.get(temp) >= 2){
                    return true;
                }
            }else {
                map.put(temp, i);
            }

        }

        return false;
    }

}
