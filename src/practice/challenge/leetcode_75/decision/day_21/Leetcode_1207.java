package practice.challenge.leetcode_75.decision.day_21;

// Unique Number of Occurrences
// https://leetcode.com/problems/unique-number-of-occurrences/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_1207 {

    public static void main(String[] args) {
        System.out.println(uniqueOccurrences(new int[]{1,2,2,1,1,3}));
        System.out.println(uniqueOccurrences(new int[]{1,2}));
        System.out.println(uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int temp : arr){
            map.put(temp,map.getOrDefault(temp,0) + 1);
        }

        Set<Integer> set = new TreeSet<>();

        for (int temp : map.values()){
            set.add(temp);
        }

        return set.size() == map.values().size();
    }


}
