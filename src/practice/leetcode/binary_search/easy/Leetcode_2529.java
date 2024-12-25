package practice.leetcode.binary_search.easy;

// Maximum Count of Positive Integer and Negative Integer
// https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/description/

public class Leetcode_2529 {

    public static void main(String[] args) {
        System.out.println(maximumCount(new int[]{-2,-1,-1,1,2,3}));
    }

    public static int maximumCount(int[] nums) {
        int negative = countNegative(nums);
        int positiv = countPositiv(nums);

        return Math.max(negative, positiv);
    }

    private static int countNegative(int[] nums){
        int l = 0;
        int r = nums.length - 1;

        int index = -1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (nums[m] < 0){
                index = m;
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        return index + 1;
    }


    private static int countPositiv(int[] nums){
        int l = 0;
        int r = nums.length - 1;

        int index = -1;

        while (l <= r){
            int m = (l + r) / 2;

            if (nums[m] > 0){
                index = m;
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return index == -1 ? 0 : nums.length - index;
    }


}
