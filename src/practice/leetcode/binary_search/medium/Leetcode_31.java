package practice.leetcode.binary_search.medium;

// Next Permutation
// https://leetcode.com/problems/next-permutation/description/

import java.util.Arrays;

public class Leetcode_31 {

    private static int anInt = 0;

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,4,0,1,2,4,4,0};
        nextPermutation(nums);
        for (int temp : nums){
            System.out.print(temp + " ");
        }
    }

    public static void nextPermutation(int[] nums) {
        int temp = nums.length - 1;

        while (temp - 1 >= 0 && nums[temp - 1] >= nums[temp]){
            temp--;
        }

        if (temp <= 0){
            Arrays.sort(nums);
            return;
        }

        boolean binary = binary(nums, temp, nums[temp], nums[temp - 1]);

        int count;

        if (binary){
            count = nums[anInt];
        }else {
            count = nums[temp];
            anInt = temp;
        }

        nums[anInt] = nums[temp - 1];
        nums[temp - 1] = count;

        reverse(nums,temp);
    }

    private static boolean binary(int[] nums, int index, int less, int up){
        int l = index + 1;
        int r = nums.length - 1;

        Integer answer = null;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (nums[m] < less && nums[m] > up){
                answer = m;
                l = m + 1;
            } else if (nums[m] >= less) {
                l = m + 1;
            } else if (nums[m] <= up) {
                r = m - 1;
            }

        }

        if (answer != null){
            anInt = answer;
        }

        return answer != null;
    }

    private static void reverse(int[] nums, int index){
        int l = index;
        int r = nums.length - 1;

        while (l < r){
            if (nums[l] > nums[r]) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }else {
                l++;
            }
        }

    }

}
