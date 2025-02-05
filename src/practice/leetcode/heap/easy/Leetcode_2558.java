package practice.leetcode.heap.easy;

// Take Gifts From the Richest Pile
// https://leetcode.com/problems/take-gifts-from-the-richest-pile/description/

import java.util.Comparator;
import java.util.PriorityQueue;

public class Leetcode_2558 {

    public static void main(String[] args) {
        System.out.println(pickGifts(new int[]{25,64,9,4,100}, 4));
    }

    public static long pickGifts(int[] gifts, int k) {
        PriorityQueue<Long> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        for (int temp : gifts){
            priorityQueue.add((long) temp);
        }

        while (k != 0){
            Long poll = priorityQueue.poll();
            priorityQueue.add((long) Math.sqrt(poll));
        }

        Long res = 0l;

        for (Long temp : priorityQueue){
            res += temp;
        }

        return res;
    }

}
