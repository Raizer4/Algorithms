package practice.leetcode.leetcode_75.decision.day_4.similar;

// Minimum Operations to Make the Array Increasing
// https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/description/

public class Leetcode_1827 {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{1,1,1}));
    }

    public static int minOperations(int[] nums) {
        int result = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] >= nums[i]){
                int temp = nums[i - 1] - nums[i];
                temp++;
                nums[i] = temp + nums[i];
                result += temp;
            }
        }

        return result;
    }

}
