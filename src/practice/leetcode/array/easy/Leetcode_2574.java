package practice.leetcode.array.easy;

// Left and Right Sum Differences
// https://leetcode.com/problems/left-and-right-sum-differences/description/

public class Leetcode_2574 {

    public static void main(String[] args) {
        int[] ints = leftRightDifference(new int[]{10, 4, 8, 3});

        for (int temp : ints){
            System.out.print(temp + " ");
        }
    }

    public static int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
           result[i] = Math.abs(rightDifference(nums,i) - leftDifference(nums,i));
        }

        return result;
    }

    private static int rightDifference(int[] nums, int k){
        if (k == nums.length - 1){
            return 0;
        }

        int right = 0;

        for (int i = k + 1; i < nums.length; i++){
            right += nums[i];
        }

        return right;
    }

    private static int leftDifference(int[] nums, int k){
        if (k == 0){
            return 0;
        }

        int left = 0;

        for (int i = k - 1; i >= 0; i--){
            left += nums[i];
        }

        return left;
    }

}
