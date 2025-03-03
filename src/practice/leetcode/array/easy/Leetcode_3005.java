package practice.leetcode.array.easy;

// Count Elements With Maximum Frequency
// https://leetcode.com/problems/count-elements-with-maximum-frequency/description/

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Leetcode_3005 {

    public static void main(String[] args) {
        System.out.println(maxFrequencyElements(new int[]{1,2,2,3,1,4}));
    }

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int temp : nums){
            map.put(temp,map.getOrDefault(temp,0) + 1);
        }

        Integer max = Collections.max(map.values());
        int count = 0;


        for (int temp : nums){
            if (map.get(temp) == max){
                count++;
            }
        }

        return count;
    }

}
