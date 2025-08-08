package practice.leetcode.hash_table.easy;

// Maximum Unique Subarray Sum After Deletion
// https://leetcode.com/problems/maximum-unique-subarray-sum-after-deletion/description/?envType=daily-question&envId=2025-07-25

import java.util.HashMap;
import java.util.Map;


public class Leetcode_3487 {

    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1,2,-1,-2,1,0,-1}));
    }

    public static int maxSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        int max = Integer.MIN_VALUE;

        for (int temp : nums){
            if (temp > 0){
                map.put(temp, 0);
            }
            max = Math.max(max, temp);
        }

        if (max < 0){
            return max;
        }

        int sum = 0;

        for (int temp : map.keySet()){
            sum += temp;
        }

        return sum;
    }

}
