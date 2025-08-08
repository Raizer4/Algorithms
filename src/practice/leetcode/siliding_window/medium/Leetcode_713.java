package practice.leetcode.siliding_window.medium;

// Subarray Product Less Than K
// https://leetcode.com/problems/subarray-product-less-than-k/description/

public class Leetcode_713 {

    public static void main(String[] args) {
        System.out.println(numSubarrayProductLessThanK(new int[]{1,1,1}, 1));
        System.out.println(numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100));
        System.out.println(numSubarrayProductLessThanK(new int[]{1,2,3}, 0));
    }

    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0;

        int count = 1;

        int answer = 0;

        for (int r = 0; r < nums.length; r++) {
            count *= nums[r];

            while (l <= r && count >= k){
                count /= nums[l];
                l++;
            }

            answer += r - l + 1;
        }

        return answer;
    }

}
