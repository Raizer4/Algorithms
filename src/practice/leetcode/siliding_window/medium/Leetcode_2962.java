package practice.leetcode.siliding_window.medium;

// Count Subarrays Where Max Element Appears at Least K Times
// https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/description/

public class Leetcode_2962 {

    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{1,3,2,3,3}, 2));
    }

    public static long countSubarrays(int[] nums, int k) {
        int max = 0;
        int l = 0;
        int count = 0;
        long res = 0;

        for (int temp : nums){
            max = Math.max(max,temp);
        }

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == max){
                count++;
            }

            while (count >= k){
                if (nums[l++] == max){
                    count--;
                }
            }

            res += l;
        }

        return res;
    }



}
