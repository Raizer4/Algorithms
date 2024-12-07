package practice.leetcode.hash_table.medium;

// Top K Frequent Elements
// https://leetcode.com/problems/top-k-frequent-elements/description/

import java.util.*;

public class Leetcode_347 {

    public static void main(String[] args) {
        int[] arr = topKFrequent(new int[]{1}, 1);
        for (int temp : arr){
            System.out.print(temp + " ");
        }
    }


    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer temp : nums){
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length + 1; i++){
            res.add(new ArrayList<>());
        }

        for (Map.Entry entry : map.entrySet()){
            res.get((Integer) entry.getValue()).add((Integer) entry.getKey());
        }

        int[] arr = new int[k];

        int index = 0;

        for (int i = (nums.length + 1) - 1; i >= 0 && index < k; i--){
            if (!res.get(i).isEmpty()){
                for (Integer temp : res.get(i)){
                    arr[index++] = temp;
                }
            }
        }

        return arr;
    }

}
