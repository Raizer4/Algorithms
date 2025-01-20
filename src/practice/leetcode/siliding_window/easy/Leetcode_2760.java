package practice.leetcode.siliding_window.easy;

// Longest Even Odd Subarray With Threshold
// https://leetcode.com/problems/longest-even-odd-subarray-with-threshold/description/

public class Leetcode_2760 {

    public static void main(String[] args) {
        System.out.println(longestAlternatingSubarray(new int[]{3,2,5,4},5));
        System.out.println(longestAlternatingSubarray(new int[]{1,2},2));
        System.out.println(longestAlternatingSubarray(new int[]{2,3,4,5},4));
        System.out.println(longestAlternatingSubarray(new int[]{4,10,3},10));
        System.out.println(longestAlternatingSubarray(new int[]{4},1));
        System.out.println(longestAlternatingSubarray(new int[]{10,2,4,6,4,9,10},12));
    }

    public static int longestAlternatingSubarray(int[] nums, int threshold) {
        int max = 0;
        int temp = 0;
        int count = 0;
        boolean flag = false;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0 && !flag && nums[i] <= threshold){
                temp++;
                flag = true;
            }else if (nums[i] % 2 == 1 && flag && nums[i] <= threshold){
                temp++;
                flag = false;
            }else {
                max = Math.max(max,temp);
                temp = 0;
                if (nums[i] % 2 == 0 && count <= 10){
                    i--;
                    count++;
                }else {
                    count = 0;
                }
                flag = false;

            }

        }

        max = Math.max(max,temp);

        return max;
    }

}
