package practice.leetcode.binary_search.medium;

// Find First and Last Position of Element in Sorted Array
// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

public class Leetcode_34 {

    public static void main(String[] args) {
        int[] ints = searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8);

        for (int temp : ints){
            System.out.print(temp + " ");
        }

    }

    public static int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        int start = -1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (nums[m] == target){
                start = m;
                r = m - 1;
            }else if (nums[m] < target){
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        l = 0;
        r = nums.length - 1;

        int end = -1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (nums[m] == target){
                end = m;
                l = m + 1;
            }else if (nums[m] < target){
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        return new int[]{start,end};
    }

}
