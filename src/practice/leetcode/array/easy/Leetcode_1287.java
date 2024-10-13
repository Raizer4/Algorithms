package practice.leetcode.array.easy;

// Element Appearing More Than 25% In Sorted Array
// https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/description/

import java.util.*;

public class Leetcode_1287 {

    public static void main(String[] args) {
        System.out.println(findSpecialInteger(new int[]{1,2,2,6,6,6,7,10}));
    }

    public static int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int temp : arr){
            if (map.containsKey(temp)){
                Integer integer = map.get(temp);
                integer++;
                map.put(temp,integer);
            }else {
                map.put(temp, 1);
            }
        }

        Integer max = Collections.max(map.values());


        for (Map.Entry t : map.entrySet()){
            if (t.getValue() == max){
                return (Integer)t.getKey();
            }
        }

        return 0;
    }
}
