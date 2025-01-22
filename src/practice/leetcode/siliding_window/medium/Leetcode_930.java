package practice.leetcode.siliding_window.medium;

// Binary Subarrays With Sum
// https://leetcode.com/problems/binary-subarrays-with-sum/description/

public class Leetcode_930 {

    public static void main(String[] args) {
        System.out.println(numSubarraysWithSum(new int[]{1,0,1,0,1}, 2));
        System.out.println(numSubarraysWithSum(new int[]{0,0,0,0,0}, 0));
    }

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;

        int left = 0;
        int right = 0;

        int window_sum = 0;
        int count_zeroes = 0;
        int result = 0;

        while(right < n) {
            window_sum += nums[right];

            while (left < right && (nums[left] == 0 || window_sum > goal)) {

                if (nums[left] == 0) {
                    count_zeroes++;
                }else {
                    count_zeroes = 0;
                }

                window_sum -= nums[left];

                left++;
            }

            if (window_sum == goal) {
                result += 1 + count_zeroes;
            }

            right++;
        }

        return result;
    }

}
