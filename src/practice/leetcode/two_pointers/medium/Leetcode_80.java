package practice.leetcode.two_pointers.medium;

// Remove Duplicates from Sorted Array II
// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/

public class Leetcode_80 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;

        int index = 0;

        while (j <= nums.length){
            nums[index++] = nums[i];

            if (j < nums.length && nums[i] != nums[j]){
                i++;
                j++;
                continue;
            }else {
                while (j + 1 < nums.length && nums[j] == nums[j + 1]){
                    j++;
                }
            }

            j++;
            i = j - 1;
        }

        return index;
    }

}
