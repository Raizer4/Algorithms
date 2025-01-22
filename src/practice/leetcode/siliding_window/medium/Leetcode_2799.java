package practice.leetcode.siliding_window.medium;

// Count Complete Subarrays in an Array
// https://leetcode.com/problems/count-complete-subarrays-in-an-array/description/

import java.util.HashMap;

public class Leetcode_2799 {

    public static void main(String[] args) {
        System.out.println(countCompleteSubarrays(new int[]{1,3,1,2,2}));
        System.out.println(countCompleteSubarrays(new int[]{5,5,5,5}));
    }

    public static int countCompleteSubarrays(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int res = 0;
        int l = 0;

        for (int temp : nums){
            if (!map.containsKey(temp)){
                map.put(temp,0);
            }
        }


        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while (!map.values().contains(0)){
                map.put(nums[l],map.get(nums[l]) - 1);
                l++;
            }

            res += l;
        }

        return res;
    }

}
