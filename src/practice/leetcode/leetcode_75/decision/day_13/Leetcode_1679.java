package practice.leetcode.leetcode_75.decision.day_13;

// Max Number of K-Sum Pairs
// https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_1679 {

    public static void main(String[] args) {
        System.out.println(maxOperations(new int[]{1,2,3,4},5));
        System.out.println(maxOperations(new int[]{3,1,3,4,3},6));
    }

    public static int maxOperations(int[] nums, int k) {
        int i = 0;
        int j = nums.length - 1;
        int count = 0;

        Arrays.sort(nums);

        while (i < j){
            int sum = nums[i] + nums[j];

            if (sum == k){
                count++;
                i++;
                j--;
            }else if (sum < k){
               i++;
            }else {
                j--;
            }

        }

        return count;
    }


}
