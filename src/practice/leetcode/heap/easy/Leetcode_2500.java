package practice.leetcode.heap.easy;

// Delete Greatest Value in Each Row
// https://leetcode.com/problems/delete-greatest-value-in-each-row/description/

import java.util.Collections;
import java.util.PriorityQueue;

public class Leetcode_2500 {

    public static void main(String[] args) {
        System.out.println(deleteGreatestValue(new int[][]{{1,2,4},{3,3,1}}));
    }

    public static int deleteGreatestValue(int[][] grid) {
        PriorityQueue<Integer>[] queues = new PriorityQueue[grid.length];

        for (int i = 0; i < grid.length; i++){
            queues[i] = new PriorityQueue<>(Collections.reverseOrder());
            for (int num : grid[i]){
                queues[i].add(num);
            }
        }

        int res = 0;

        while (!queues[0].isEmpty()){
            int maxInStep = 0;

            for (PriorityQueue<Integer> queue : queues){
                if (!queue.isEmpty()){
                    maxInStep = Math.max(maxInStep, queue.peek());
                }
            }

            res += maxInStep;

            for (PriorityQueue<Integer> queue : queues){
                if (!queue.isEmpty()){
                    queue.poll();
                }
            }
        }

        return res;
    }

}
