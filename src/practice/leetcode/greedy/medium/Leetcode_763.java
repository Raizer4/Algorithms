package practice.leetcode.greedy.medium;

// Partition Labels
// https://leetcode.com/problems/partition-labels/description/

import java.util.*;

public class Leetcode_763 {

    public static void main(String[] args) {
        System.out.println(partitionLabels("caedbdedda"));
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println(partitionLabels("eccbbbbdec"));
    }

    public static List<Integer> partitionLabels(String s) {
        Map<Character, int[]> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), new int[]{i, i});
            }else {
                map.get(s.charAt(i))[1] = i;
            }

        }


        int max = 0;
        int size = 0;

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            size++;
            max = Math.max(max, map.get(s.charAt(i))[1]);

            if (max == i){
                list.add(size);
                size = 0;
            }
        }

        return list;
    }


}
