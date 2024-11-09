package practice.leetcode.leetcode_75.decision.day_20.similar;

// Subarrays Distinct Element Sum of Squares I
// https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-i/description/

import java.util.*;

public class Leetcode_2913 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(5);
        list.add(5);

        System.out.println(sumCounts(list));
    }

    public static int sumCounts(List<Integer> nums) {
        int totalSum = 0;
        int n = nums.size();

        for (int i = 0; i < n; i++) {
            Set<Integer> uniqueValues = new HashSet<>();

            for (int j = i; j < n; j++) {
                uniqueValues.add(nums.get(j));
                int distinctCount = uniqueValues.size();
                totalSum += distinctCount * distinctCount;
            }

        }

        return totalSum;
    }


}
