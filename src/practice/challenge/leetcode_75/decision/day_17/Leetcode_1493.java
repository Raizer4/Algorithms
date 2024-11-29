package practice.challenge.leetcode_75.decision.day_17;

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
       int j = 0;
       int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0){
                zero++;
            }

            while (zero > 1){
                if (nums[j] == 0){
                    zero--;
                }

                j++;
            }

            max = Math.max(max,i - j);
        }

        return max;
    }

}
