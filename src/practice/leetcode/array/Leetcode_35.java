package practice.leetcode.array;

// Search Insert Position
// https://leetcode.com/problems/search-insert-position/description/

public class Leetcode_35 {

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1,3,5,6},5));
        System.out.println(searchInsert(new int[]{1,3,5,6},2));
        System.out.println(searchInsert(new int[]{1,3,5,6},7));
    }

    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length;i++){
            if (nums[i] >= target){
                return i;
            }
        }

        return nums.length;
    }

}
