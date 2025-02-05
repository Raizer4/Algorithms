package practice.leetcode.heap.easy;

// Minimum Amount of Time to Fill Cups
// https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/description/

import java.util.Comparator;
import java.util.PriorityQueue;

public class Leetcode_2335 {

    public static void main(String[] args) {
        System.out.println(fillCups(new int[]{1,4,2}));
    }

    public static int fillCups(int[] amount) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int temp : amount){
            if (temp != 0){
                priorityQueue.add(temp);
            }
        }

        int count = 0;

        while (!priorityQueue.isEmpty()){
            Integer temp_1 = priorityQueue.poll();

            if (priorityQueue.size() >= 1){
                Integer temp_2 = priorityQueue.poll();
                int num_1 = temp_2 - 1;

                if (num_1 != 0){
                    priorityQueue.add(num_1);
                }
            }

            int num = temp_1 - 1;
            if (num != 0){
                priorityQueue.add(num);
            }
            count++;
        }

        return count;
    }

}
