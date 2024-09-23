package practice.leetcode.leetcode_75.day_5;

// Find the Difference of Two Arrays
// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_2215 {

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3},new int[]{2,4,6}));
        System.out.println(findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();


        for (int num : nums1) {
            set1.add(num);
        }


        for (int num : nums2) {
            set2.add(num);
        }


        Set<Integer> uniqueToNums1 = new HashSet<>(set1);
        Set<Integer> uniqueToNums2 = new HashSet<>(set2);


        uniqueToNums1.removeAll(set2);
        uniqueToNums2.removeAll(set1);


        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>(uniqueToNums1));
        result.add(new ArrayList<>(uniqueToNums2));

        return result;
    }

}
