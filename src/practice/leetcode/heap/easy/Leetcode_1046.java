package practice.leetcode.heap.easy;

// Last Stone Weight
// https://leetcode.com/problems/last-stone-weight/description/

import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode_1046 {

    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }

    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue(Collections.reverseOrder());

        for (int temp : stones){
            priorityQueue.add(temp);
        }

        while (priorityQueue.size() > 1){
            Integer max = priorityQueue.poll();
            Integer postMax = priorityQueue.poll();

            if (max == postMax){
                continue;
            }else {
                priorityQueue.add(max - postMax);
            }
        }

        if (priorityQueue.isEmpty()){
            return -1;
        }else {
            return priorityQueue.peek();
        }


    }

}
