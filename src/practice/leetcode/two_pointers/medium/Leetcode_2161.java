package practice.leetcode.two_pointers.medium;

// Partition Array According to Given Pivot
// https://leetcode.com/problems/partition-array-according-to-given-pivot/description/

public class Leetcode_2161 {

    public static void main(String[] args) {
        System.out.println(pivotArray(new int[]{9,12,5,10,14,3,10},10));
    }

    public static int[] pivotArray(int[] nums, int pivot) {
        int[] res = new int[nums.length];

        int l = 0;
        int r = nums.length - 1;

        for (int i = 0, j = nums.length - 1; i < nums.length; i++, j--) {
            if (nums[i] < pivot){
                res[l++] = nums[i];
            }

            if (nums[j] > pivot){
                res[r--] = nums[j];
            }
        }

        while (l <= r){
            res[l++] = pivot;
        }

        return res;
    }

}


