package practice.leetcode.two_pointers.easy;

// Count the Number of Incremovable Subarrays I
// https://leetcode.com/problems/count-the-number-of-incremovable-subarrays-i/description/

public class Leetcode_2970 {

    public static void main(String[] args) {
        System.out.println(incremovableSubarrayCount(new int[]{1,2,3,4}));
        System.out.println(incremovableSubarrayCount(new int[]{6,5,7,8}));
    }

    public static int incremovableSubarrayCount(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++){
            for (int j = i; j < nums.length; j++){
                if (task(nums, i, j)){
                    ans++;
                }
            }
        }

        return ans;
    }

    private static boolean task(int[] nums, int start, int end){
        for (int i = 0; i < start - 1; i++){
            if(nums[i] >= nums[i + 1]){
                return false;
            }
        }

        if (start > 0 &&
                end < nums.length - 1 &&
                nums[start - 1] >= nums[end + 1])
        {
            return false;
        }

        for (int i = end + 1; i < nums.length - 1; i++){
            if (nums[i] >= nums[i + 1]){
                return false;
            }
        }

        return true;
    }

}
