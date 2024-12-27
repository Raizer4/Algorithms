package practice.leetcode.binary_search.easy;

// Special Array With X Elements Greater Than or Equal X
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/description/

import java.util.Arrays;

public class Leetcode_1608 {

    public static void main(String[] args) {
        System.out.println(specialArray(new int[]{3,5}));
        System.out.println(specialArray(new int[]{0,0}));
        System.out.println(specialArray(new int[]{0,4,3,0,4}));
    }

    public static int specialArray(int[] nums) {
        Arrays.sort(nums);

        int temp = nums.length;

        while (temp != 0){
            if (binary(nums,temp)){
                return temp;
            }
            temp--;
        }


        return -1;
    }

    private static boolean binary(int[] nums, int target){
        int l = 0;
        int r = nums.length - 1;

        int index = -1;

        while (l <= r){
            int m = (l + r) / 2;

            if (nums[m] >= target){
                index = m;
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return index != -1 && ((nums.length - index) == target);
    }

}
