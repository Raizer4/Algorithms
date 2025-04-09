package practice.leetcode.array.medium;

// Sort an Array
// https://leetcode.com/problems/sort-an-array/description/

public class Leetcode_912 {

    public static void main(String[] args) {
        System.out.println(sortArray(new int[]{}));
    }

    public static int[] sortArray(int[] nums) {
        if (nums.length <= 1){
            return nums;
        }

        int mid = nums.length / 2;

        int[] left = new int[mid];
        int[] right = new int[nums.length - mid];

        System.arraycopy(nums, 0, left,0 , mid);
        System.arraycopy(nums, mid, right, 0, nums.length - mid);

        sortArray(left);
        sortArray(right);

        merge(nums, left, right);

        return nums;
    }

    private static void merge(int[] result, int[] left, int[] right){
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length){
            if (left[i] <= right[j]){
                result[k++] = left[i++];
            }else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length){
            result[k++] = left[i++];
        }

        while (j < right.length){
            result[k++] = right[j++];
        }

    }


}
