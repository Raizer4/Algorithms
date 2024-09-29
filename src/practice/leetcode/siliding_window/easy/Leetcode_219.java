package practice.leetcode.siliding_window.easy;

// Contains Duplicate II
// https://leetcode.com/problems/contains-duplicate-ii/description/


import java.util.HashSet;
import java.util.Set;

public class Leetcode_219 {

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1},3));
        System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1},1));
        System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (window.contains(nums[i])) {
                return true;
            }

            window.add(nums[i]);

            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }

        return false;
    }

}
