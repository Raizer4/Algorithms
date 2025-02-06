package practice.leetcode.heap.medium;

// Task Scheduler
// https://leetcode.com/problems/task-scheduler/description/

import java.util.*;

public class Leetcode_621 {

    public static void main(String[] args) {
        System.out.println(leastInterval(new char[]{'A','A','A','B','B','B'}, 2));
    }

    public static int leastInterval(char[] tasks, int n) {
        Map<Character, Integer> map = new HashMap<>();

        for (char task : tasks) {
            map.put(task, map.getOrDefault(task, 0) + 1);
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(map.values());

        int count = 0;

        while (!priorityQueue.isEmpty()) {
            List<Integer> temp = new ArrayList<>();


            for (int i = 0; i <= n; i++) {

                if (!priorityQueue.isEmpty()) {
                    int freq = priorityQueue.poll();

                    if (freq > 1) {
                        temp.add(freq - 1);
                    }
                }

                count++;

                if (priorityQueue.isEmpty() && temp.isEmpty()) {
                    break;
                }
            }

            priorityQueue.addAll(temp);
        }

        return count;
    }

}
