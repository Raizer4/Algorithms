package practice.leetcode.binary_search.easy;

// Intersection of Two Arrays
// https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.*;

public class Leetcode_349 {

    public static void main(String[] args) {
        int[] intersection = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        for (int temp : intersection){
            System.out.print(temp + " ");
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);

        Set<Integer> list = new HashSet<>();

        for (int temp : nums2){
            if (binary(nums1,temp) && !list.contains(temp)){
                list.add(temp);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    private static boolean binary(int[] nums, int temp){
        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            int mid = l + (r - l) / 2;

            if (nums[mid] == temp){
                return true;
            } else if (nums[mid] < temp) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }

        }

        return false;
    }


}
