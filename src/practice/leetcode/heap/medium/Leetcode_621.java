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

        for (char temp : tasks) {
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(map.values());

        int count = 0;

        while (!priorityQueue.isEmpty()) {
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i <= n; i++) {

                if (!priorityQueue.isEmpty()) {
                    int poll = priorityQueue.poll();

                    if (poll > 1) {
                        arr.add(poll - 1);
                    }
                }

                count++;

                if (priorityQueue.isEmpty() && arr.isEmpty()){
                    break;
                }
            }

            priorityQueue.addAll(arr);
       }

       return count;
    }

}
