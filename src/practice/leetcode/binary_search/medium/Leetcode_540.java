package practice.leetcode.binary_search.medium;

// Single Element in a Sorted Array
// https://leetcode.com/problems/single-element-in-a-sorted-array/description/

public class Leetcode_540 {

    public static void main(String[] args) {
        System.out.println(singleNonDuplicate(new int[]{1}));
    }

    public static int singleNonDuplicate(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if ((m - 1) >= 0 && (m + 1) <= nums.length - 1){
                if (nums[m] != nums[m - 1] && nums[m] != nums[m + 1]){
                    return nums[m];
                }
            }else if ((m - 1) >= 0){
                if (nums[m] != nums[m - 1]){
                    return nums[m];
                }
            }else if ((m + 1) <= nums.length - 1){
                if (nums[m] != nums[m + 1]){
                    return nums[m];
                }
            }else {
                return nums[m];
            }

            if (m % 2 == 0){
                if ((m + 1) <= nums.length - 1 && nums[m + 1] == nums[m]){
                    l = m + 1;
                }else {
                    r = m - 1;
                }
            }else {
                if ( (m - 1) >= 0 && nums[m - 1] == nums[m]){
                    l = m + 1;
                }else {
                    r = m - 1;
                }
            }

        }

        return -1;
    }

}
