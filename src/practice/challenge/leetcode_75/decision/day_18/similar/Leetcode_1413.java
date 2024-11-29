package practice.challenge.leetcode_75.decision.day_18.similar;

// Minimum Value to Get Positive Step by Step Sum
// https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/description/

public class Leetcode_1413 {

    public static void main(String[] args) {
        System.out.println(minStartValue(new int[]{-3,2,-3,4,2}));
        System.out.println(minStartValue(new int[]{1,2}));
        System.out.println(minStartValue(new int[]{2,3,5,-5,-1}));
    }

    public static int minStartValue(int[] nums) {
        int startValue = 1;

        int i = 0;
        int sum = 0;

        while (i < nums.length){
            if (i == 0){
                sum = startValue;
            }

             sum += nums[i++];
             if (sum < 1){
                 i = 0;
                 ++startValue;
             }
        }

        return startValue;
    }

}
