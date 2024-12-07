package practice.leetcode.hash_table.easy;

// Two Sum
// https://leetcode.com/problems/two-sum/

import java.util.HashMap;

public class Leetcode_1 {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{2,7,11,15}, 9);
        if (ints.length == 0){
            System.out.println("Нет нужных данных");
        }else {
            for (int temp : ints){
                System.out.print(temp + " ");
            }
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int i = 0;

        for (Integer temp : nums){
            int key = target - temp;
            if (map.containsKey(temp)){
                return new int[] {map.get(temp), i};
            }else {
                map.put(key,i++);
            }
        }

        return new int[] {-1, -1};
    }

}
