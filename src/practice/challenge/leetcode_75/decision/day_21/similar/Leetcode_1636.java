package practice.challenge.leetcode_75.decision.day_21.similar;

// Sort Array by Increasing Frequency
// https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
//1
import java.util.*;

public class Leetcode_1636 {

    public static void main(String[] args) {
        int[] ints = frequencySort(new int[]{1,1,2,2,2,3});

        for (int temp : ints){
            System.out.print(temp + " ");
        }

    }

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int temp : nums){
            map.put(temp, map.getOrDefault(temp,0) + 1);
        }

        int size = 0;

        for (Integer value : map.values()) {
            size += value;
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((e1,e2)-> {
            int freq = Integer.compare(e1.getValue(),e2.getValue());
            if (freq == 0){
                return Integer.compare(e2.getKey(),e1.getKey());
            }
            return freq;
        });

        int[] res = new int[size];
        int index = 0;

        for (Map.Entry entry : list){
            for (int i = 0; i < (int) entry.getValue(); i++){
                res[index++] = (int) entry.getKey();
            }
        }

        return res;
    }

}
