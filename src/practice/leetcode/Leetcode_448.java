package practice.leetcode;

// Find All Numbers Disappeared in an Array
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.*;

public class Leetcode_448 {

    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
        System.out.println(findDisappearedNumbers(new int[]{1,1}));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] hasnum=new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            hasnum[nums[i]-1]=true;
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<hasnum.length;i++){
            if(!hasnum[i]){
                list.add(i+1);
            }
        }
        return list;
    }

}
