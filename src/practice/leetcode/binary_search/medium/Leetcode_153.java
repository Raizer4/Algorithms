package practice.leetcode.binary_search.medium;

// Find Minimum in Rotated Sorted Array
// https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/

public class Leetcode_153 {

    public static void main(String[] args) {
        System.out.println(findMin(new int[]{3,4,5,1,2}));
        System.out.println(findMin(new int[]{4,5,6,7,0,1,2}));
        System.out.println(findMin(new int[]{11,13,15,17}));
        System.out.println(findMin(new int[]{3,1,2}));
    }

    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        int res = nums[0];

        while (l <= r) {
            if (nums[l] < nums[r]){
                res = Math.min(res,nums[l]);
                break;
            }

            int m = (l + r) / 2;

            res = Math.min(res,nums[m]);

            if (nums[m] >= nums[r]) {
                l = m + 1;
            } else {
                r = m - 1;
            }

        }

        return res;
    }

}
