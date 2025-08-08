package practice.leetcode.siliding_window.medium;

// Minimum Size Subarray Sum
// https://leetcode.com/problems/minimum-size-subarray-sum/description/

public class Leetcode_209 {

    public static void main(String[] args) {
        System.out.println(minSubArrayLen(11, new int[]{1,2,3,4,5}));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int temp = 0;
        int j = 0;
        int answer = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];

            while (temp >= target){
                answer = Math.min(answer, i - j + 1);
                temp -= nums[j++];
            }
        }

        return answer;
    }

}
