package practice.challenge.leetcode_75.decision.day_18.similar;

// Find the Middle Index in Array
// https://leetcode.com/problems/find-the-middle-index-in-array/description/

public class Leetcode_1991 {

    public static void main(String[] args) {
        System.out.println(findMiddleIndex(new int[]{2,3,-1,8,4}));
    }

    public static int findMiddleIndex(int[] nums) {
        int total_sum = 0;
        int left_sum = 0;

        for(int n : nums){
            total_sum += n;
        }

        for (int i = 0; i < nums.length; i++) {
            int right_sum = total_sum - left_sum - nums[i];

            if (left_sum == right_sum) {
                return i;
            }

            left_sum += nums[i];
        }

        return -1;
    }



}
