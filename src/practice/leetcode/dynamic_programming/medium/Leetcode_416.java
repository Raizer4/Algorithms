package practice.leetcode.dynamic_programming.medium;

// Partition Equal Subset Sum
// https://leetcode.com/problems/partition-equal-subset-sum/description/

import java.util.*;

public class Leetcode_416 {

    public static void main(String[] args) {
        System.out.println(canPartition(new int[]{1,5,11,5}));
        System.out.println(canPartition(new int[]{1, 2, 3, 5}));
    }

    public static boolean canPartition(int[] nums) {
        if (Arrays.stream(nums).sum() % 2 != 0) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        set.add(0);

        int target = Arrays.stream(nums).sum() / 2;

        for (int i = nums.length - 1; i >= 0; i--) {
           Set<Integer> dp = new HashSet<>();

            for (int temp : set){
                if (temp + nums[i] == target){
                    return true;
                }
                dp.add(temp + nums[i]);
                dp.add(temp);
            }

            set = dp;
        }

        return false;
    }

}
