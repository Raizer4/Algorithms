package practice.challenge.leetcode_75.decision.day_13.similar;

// Intersection of Two Arrays II
// https://leetcode.com/problems/intersection-of-two-arrays-ii/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Leetcode_350 {

    public static void main(String[] args) {
        int[] intersect = intersect(new int[]{1,2,2,1}, new int[]{2,2});

        for (int temp : intersect){
            System.out.println(temp);
        }

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int temp : nums1){
            map.put(temp,map.getOrDefault(temp,0) + 1);
        }

        HashMap<Integer,Integer> tempMap = new HashMap<>();

        for (int temp : nums2){
            tempMap.put(temp,tempMap.getOrDefault(temp,0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int key : map.keySet()){
            if (tempMap.containsKey(key)){
                int min = Math.min(map.get(key), tempMap.get(key));
                for (int i = 0; i < min; i++){
                    list.add(key);
                }
            }
        }

        int[] arr = new int[list.size()];
        int index = 0;

        for (int temp : list){
            arr[index++] = temp;
        }

        return arr;
    }

}
