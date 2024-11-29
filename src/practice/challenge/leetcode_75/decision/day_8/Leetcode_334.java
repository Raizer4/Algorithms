package practice.challenge.leetcode_75.decision.day_8;

// Increasing Triplet Subsequence
// https://leetcode.com/problems/increasing-triplet-subsequence/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_334 {

    public static void main(String[] args) {
        System.out.println(increasingTriplet(new int[]{20,100,10,12,5,13}));
        System.out.println(increasingTriplet(new int[]{5,4,3,2,1}));
        System.out.println(increasingTriplet(new int[]{2,1,5,0,4,6}));
    }

    public static boolean increasingTriplet(int[] nums) {
       Integer max_1 = Integer.MAX_VALUE;
       Integer max_2 = Integer.MAX_VALUE;

       for(int temp : nums){
           if (max_1 > temp){
               max_1 = temp;
           }else if (max_2 > temp){
               max_2 = temp;
           }else {
               return true;
           }
       }

       return false;
    }

}
