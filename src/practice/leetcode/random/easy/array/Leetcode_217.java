package practice.leetcode.random.easy.array;

// Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/description/

import java.util.HashSet;
import java.util.Set;

public class Leetcode_217 {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int temp : nums){
            set.add(temp);
        }
        return set.size() != nums.length;
    }

}
