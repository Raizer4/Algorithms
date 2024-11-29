package practice.challenge.leetcode_75.decision.day_20;

// Find the Difference of Two Arrays
// https://leetcode.com/problems/find-the-difference-of-two-arrays/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_2215 {

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1,2,3},new int[]{2,4,6}));
        System.out.println(findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set_1 = new TreeSet<>();
        Set<Integer> set_2 = new TreeSet<>();

        for (int temp : nums1){
            set_1.add(temp);
        }

        for (int temp : nums2){
            set_2.add(temp);
        }

        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new ArrayList<>();

        for (int temp : set_1){
            if (!set_2.contains(temp)){
                list_1.add(temp);
            }
        }

        for (int temp : set_2){
            if (!set_1.contains(temp)){
                list_2.add(temp);
            }
        }

        List<List<Integer>> list = new ArrayList<>();

        list.add(list_1);
        list.add(list_2);

        return list;
    }

}
