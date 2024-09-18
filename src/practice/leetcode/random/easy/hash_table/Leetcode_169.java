package practice.leetcode.random.easy.hash_table;

// Majority Element
// https://leetcode.com/problems/majority-element/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_169 {

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                Integer temp = map.get(nums[i]);
                temp++;
                map.put(nums[i],temp);
            }
        }

        for (Map.Entry temp : map.entrySet()){
            if ((Integer)temp.getValue() > nums.length/2){
                return (Integer) temp.getKey();
            }
        }

        return 0;
    }

}
