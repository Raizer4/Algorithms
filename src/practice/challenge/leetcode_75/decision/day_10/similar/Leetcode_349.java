package practice.challenge.leetcode_75.decision.day_10.similar;

// Intersection of Two Arrays
// https://leetcode.com/problems/intersection-of-two-arrays/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_349 {

    public static void main(String[] args) {
        int[] intersection = intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});

        for (int temp : intersection){
            System.out.print(temp + " ");
        }

    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> integers = new ArrayList<>();
        List<Integer> res = new ArrayList<>();

        for (int temp : nums2){
            res.add(temp);
        }

        for (int temp : nums1){
            if (res.contains(temp) && !integers.contains(temp)){
                integers.add(temp);
            }
        }

        int[] result = new int[integers.size()];

        for (int i = 0; i < integers.size(); i++){
            result[i] = integers.get(i);
        }

        return result;
    }

}
