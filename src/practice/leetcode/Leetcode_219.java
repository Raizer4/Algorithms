package practice.leetcode;

// Contains Duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/description/

import java.util.HashMap;


public class Leetcode_219 {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1},1));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                Integer integer = map.get(nums[i]);

                if ((i - integer) <= k){
                    return true;
                }
            }

            map.put(nums[i], i);
        }

        return false;
    }





}
