package practice.leetcode;

// Minimum Number of Operations to Make Array Continuous
// https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/description/

import java.util.*;

public class Leetcode_2009 {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{41,33,29,33,35,26,47,24,18,28}));
        System.out.println(minOperations(new int[]{4,2,5,3}));
        System.out.println(minOperations(new int[]{1,2,3,5,6}));
        System.out.println(minOperations(new int[]{1,10,100,1000}));
    }

    public static int minOperations(int[] nums) {
        Arrays.sort(nums);

        Map<Integer, Integer> map = new HashMap<>();

        int n = nums.length - 1;
        int l = 0;

        int answer = 0;
        int count = 0;

        for (int r = 0; r < nums.length; r++) {
            if (map.containsKey(nums[r])){
                count++;
            }

            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            while ((nums[l] + n) < nums[r]){
                Integer integer = map.get(nums[l]);

                if (integer > 1){
                    count--;
                    map.put(nums[l], integer - 1);
                }else {
                    map.remove(nums[l]);
                }

                l++;
            }

            answer = Math.max((r - l + 1) - count, answer);
        }


        return  nums.length - answer;
    }

}
