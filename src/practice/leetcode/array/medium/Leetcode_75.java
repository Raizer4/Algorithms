package practice.leetcode.array.medium;

// Sort Colors
// https://leetcode.com/problems/sort-colors/description/

public class Leetcode_75 {

    public static void main(String[] args) {

    }

    public void sortColors(int[] nums) {
        merge(nums);
    }

    private static int[] merge(int[] nums){
        if (nums.length <= 1){
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];

        System.arraycopy(nums, 0, left, 0, mid);
        System.arraycopy(nums, mid, right, 0, nums.length - mid);

        merge(left);
        merge(right);

        mergerArray(nums, left, right);
        return nums;
    }

    private static void mergerArray(int[] nums, int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){
                nums[k++] = left[i++];
            }else {
                nums[k++] = right[j++];
            }
        }

        while (i < left.length){
            nums[k++] = left[i++];
        }

        while (j < right.length){
            nums[k++] = right[j++];
        }

    }


}
