package practice.challenge.leetcode_75.decision.day_15.similar;

// Longest Harmonious Subsequence
// https://leetcode.com/problems/longest-harmonious-subsequence/description/

import java.util.*;

public class Leetcode_594 {

    public static void main(String[] args) {
        System.out.println(findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
        System.out.println(findLHS(new int[]{1,1,1,1}));
    }

    public static int findLHS(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        int maxLength = 0;

        for (int key : countMap.keySet()) {
            if (countMap.containsKey(key + 1)) {
                int currentLength = countMap.get(key) + countMap.get(key + 1);
                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }

}
