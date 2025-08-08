package practice.leetcode.binary_search.medium;

// Search in Rotated Sorted Array II
// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

public class Leetcode_81 {

    public static void main(String[] args) {
        System.out.println(search(new int[]{1,0,1,1,1}, 0));
    }

    public static boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (nums[m] == target){
                return true;
            }

            if (nums[l] == nums[m] && nums[m] == nums[r]) {
                l++;
                r--;
            }else if (nums[l] <= nums[m]){
                if (nums[l] <= target && target < nums[m]){
                    r = m - 1;
                }else {
                    l = m + 1;
                }
            }else {
                if (nums[m] < target && target <= nums[r]){
                    l = m + 1;
                }else {
                    r = m - 1;
                }
            }

        }

        return false;
    }

}
