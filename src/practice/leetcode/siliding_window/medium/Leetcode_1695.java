package practice.leetcode.siliding_window.medium;

// Maximum Erasure Value
// https://leetcode.com/problems/maximum-erasure-value/description/

import java.util.HashMap;

public class Leetcode_1695 {

    public static void main(String[] args) {
        System.out.println(maximumUniqueSubarray(new int[]{4,2,4,5,6}));
    }

    public static int maximumUniqueSubarray(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        int l = 0;

        int temp = 0;

        int res = 0;

        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r],0) + 1);

            while (map.get(nums[r]) > 1){
                map.put(nums[l], map.get(nums[l]) - 1);
                temp -= nums[l];
                l++;
            }

            temp += nums[r];
            res = Math.max(res,temp);
        }

        return res;
    }

}
