package practice.leetcode.two_pointers.easy;

// Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/


public class Leetcode_26 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1,1,2}));
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        int j = 0;
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]){
                nums[++j] = nums[i];
                count++;
            }
        }

        return count;
    }

}
