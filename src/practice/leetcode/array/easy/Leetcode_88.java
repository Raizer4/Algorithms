package practice.leetcode.array.easy;

// Merge Sorted Array
// https://leetcode.com/problems/merge-sorted-array/description/

import java.util.Arrays;

public class Leetcode_88 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,0,0,0};
        merge(arr,3, new int[]{2,5,6},3);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }

}
