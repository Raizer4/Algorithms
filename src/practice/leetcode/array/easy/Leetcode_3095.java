package practice.leetcode.array.easy;

// Shortest Subarray With OR at Least K I
// https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-i/description/

public class Leetcode_3095 {

    public static void main(String[] args) {
        System.out.println(minimumSubarrayLength(new int[]{2,1,8}, 10));
    }

    public static int minimumSubarrayLength(int[] nums, int k) {
        int answer = Integer.MAX_VALUE;

        for (int r = 0; r < nums.length; r++) {
            int temp = nums[r];

            for (int i = r; i < nums.length; i++) {
                temp |= nums[i];

                if (temp >= k){
                    answer = Math.min(answer, i - r + 1);
                }
            }
        }

        if (answer == Integer.MAX_VALUE){
            return -1;
        }

        return answer;
    }


}
