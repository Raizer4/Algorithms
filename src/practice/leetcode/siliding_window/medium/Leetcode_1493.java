package practice.leetcode.siliding_window.medium;

// Longest Subarray of 1's After Deleting One Element
// https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1493 {

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1,1,0,1}));
        System.out.println(longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
        System.out.println(longestSubarray(new int[]{1,1,1}));
    }

    public static int longestSubarray(int[] nums) {
        int zero = 0;
        int l = 0;

        int count = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0){
                zero++;
            }

            while (zero > 1){
                if (nums[l] == 0){
                    zero--;
                }
                l++;
            }

            count = Math.max(count, (r - l + 1));
        }

        return count - 1;
    }

}
