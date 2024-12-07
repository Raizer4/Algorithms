package practice.leetcode.hash_table.easy;

// Contains Duplicate
// https://leetcode.com/problems/contains-duplicate/description/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_217 {

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(containsDuplicate(new int[]{1,2,3,4}));
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,}));
    }

    public static boolean containsDuplicate(int[] nums) {
         HashSet<Integer> set = new HashSet<>();

         for (int temp : nums){
             if (!set.contains(temp)){
                 set.add(temp);
             }else {
                 return true;
             }
         }

         return false;
    }

}
