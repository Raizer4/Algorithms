package practice.leetcode.leetcode_75.day_2;

// Increasing Triplet Subsequence
// https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_334 {

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{1,2,3,4,5}));
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

    public static boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;
            } else if (num <= second) {
                second = num;
            } else {
                return true;
            }
        }
        return false;
    }

}
