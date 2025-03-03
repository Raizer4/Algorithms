package practice.leetcode.array.easy;

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
        int sum = 0;

        for (int i = 0; i < nums.size(); i++){
            Set<Integer> set = new TreeSet<>();
            for (int j = i; j < nums.size(); j++) {
                set.add(nums.get(j));
                sum += Math.pow(set.size(),2);
            }
        }

        return sum;
    }


}
