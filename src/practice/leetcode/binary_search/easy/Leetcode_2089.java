package practice.leetcode.binary_search.easy;

//  Find Target Indices After Sorting Array
//  https://leetcode.com/problems/find-target-indices-after-sorting-array/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_2089 {

    public static void main(String[] args) {
        System.out.println(targetIndices(new int[]{1,2,5,2,3}, 2));
    }

    public static List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        Integer l = leftIndex(nums, target);
        Integer r = rightIndex(nums, target);

        if (l == null && r == null){
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();

        for (int i = l; i <= r; i++){
            list.add(i);
        }


        return list;
    }

    private static Integer leftIndex(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;

        Integer index = null;

        while (l <= r) {
            int m = (r + l) / 2;

            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                index = m;
                r = m - 1;
            }

        }

        return index;
    }

    private static Integer rightIndex(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;

        Integer index = null;

        while (l <= r) {
            int m = (r + l) / 2;

            if (nums[m] > target) {
                r = m - 1;
            } else if (nums[m] < target) {
                l = m + 1;
            } else {
                index = m;
                l = m + 1;
            }

        }

        return index;
    }

}
