package practice.leetcode.siliding_window.medium;

// Length of Longest Subarray With at Most K Frequency
// https://leetcode.com/problems/length-of-longest-subarray-with-at-most-k-frequency/description/

import java.util.HashMap;

public class Leetcode_2958 {

    public static void main(String[] args) {
        System.out.println(maxSubarrayLength(new int[]{1,2,2,1,3},1));
    }

    public static int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int answer = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            int temp = map.getOrDefault(nums[r], 0);

            while (temp + 1 > k){
                if (nums[l] == nums[r]){
                    temp--;
                }
                map.put(nums[l], map.getOrDefault(nums[l], 0) - 1);
                l++;
            }

            answer = Math.max(answer, (r - l + 1));
            map.put(nums[r], temp + 1);
        }

        return answer;
    }

}
