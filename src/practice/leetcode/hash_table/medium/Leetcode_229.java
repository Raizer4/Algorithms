package practice.leetcode.hash_table.medium;

// Majority Element II
// https://leetcode.com/problems/majority-element-ii/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_229 {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{}));
    }

    public static List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int temp : nums){
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        int n = nums.length / 3;

        List<Integer> list = new ArrayList<>();

        for (Map.Entry entry : map.entrySet()){
            if ((Integer)entry.getValue() >= n){
                list.add((Integer) entry.getKey());
            }
        }

        return list;
    }

}
