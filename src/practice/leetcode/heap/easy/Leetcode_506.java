package practice.leetcode.heap.easy;

// Relative Ranks
// https://leetcode.com/problems/relative-ranks/description/

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Leetcode_506 {

    public static void main(String[] args) {
        System.out.println(findRelativeRanks(new int[]{5, 4, 3, 2, 1}));
    }

    public static String[] findRelativeRanks(int[] score) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int temp : score){
            priorityQueue.add(temp);
        }

        Map<Integer,String> map = new HashMap<>();

        int number = 1;
        while (!priorityQueue.isEmpty()){
            Integer poll = priorityQueue.poll();

            if (number == 1){
                map.put(poll,"Gold Medal");
            }else if (number == 2){
                map.put(poll,"Silver Medal");
            }else if (number == 3){
                map.put(poll, "Bronze Medal");
            }else {
                map.put(poll, String.valueOf(number));
            }

            number++;
        }

        String[] str = new String[score.length];

        for (int i = 0; i < score.length; i++){
            str[i] = map.get(score[i]);
        }

        return str;
    }

}
