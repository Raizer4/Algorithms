package practice.leetcode.prefix_sum.medium;

// Count Subarrays With Score Less Than K
// https://leetcode.com/problems/count-subarrays-with-score-less-than-k/description/

public class Leetcode_2302 {

    public static void main(String[] args) {
        System.out.println(countSubarrays(new int[]{2,1,4,3,5}, 10));
    }

    public static long countSubarrays(int[] nums, long k) {
        long prefix = 0;
        long answer = 0;
        int l = 0;

        for (int r = 0; r < nums.length; r++) {
            prefix += nums[r];

            while ( (prefix * (r - l + 1)) >= k){
                prefix -= nums[l++];
            }

            answer += (r - l + 1);
        }

        return answer;
    }

}
