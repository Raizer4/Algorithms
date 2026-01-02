package practice.leetcode.array.medium;

// Rotate Array
// https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

public class Leetcode_189 {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        rotate(arr, 4);
    }

    public static void rotate(int[] nums, int k) {
        int[] temp = new int[nums.length];

        if (nums.length == k){
            return;
        } else if (nums.length < k ) {
            k = k % nums.length;
        }


        for (int i = 0; i < nums.length - k; i++) {
            temp[i + k] = nums[i];
        }

        int j = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            temp[j++] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

    }

}
