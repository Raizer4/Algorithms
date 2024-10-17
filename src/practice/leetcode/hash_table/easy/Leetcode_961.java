package practice.leetcode.hash_table.easy;

// N-Repeated Element in Size 2N Array
// https://leetcode.com/problems/n-repeated-element-in-size-2n-array/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_961 {

    public static void main(String[] args) {
        System.out.println(repeatedNTimes(new int[]{1,2,3,3}));
        System.out.println(repeatedNTimes(new int[]{2,1,2,5,3,2}));
        System.out.println(repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

    public static int repeatedNTimes(int[] nums) {
        int count = nums.length / 2;

        HashMap<Integer,Integer> map = new HashMap<>();

        for (Integer temp : nums){
            int i = map.getOrDefault(temp, 0) + 1;
            map.put(temp,i);
        }

       for (Map.Entry temp : map.entrySet()){
           if ((Integer) temp.getValue() == count){
               return (int) temp.getKey();
           }
       }

        return 0;
    }

}
