package practice.leetcode.heap.medium;

// Kth Largest Element in an Array
// https://leetcode.com/problems/kth-largest-element-in-an-array/description/

import java.util.PriorityQueue;

public class Leetcode_215 {

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3,2,1,5,6,4},2));
    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int temp : nums){
            priorityQueue.offer(temp);
            if (priorityQueue.size() > k){
                priorityQueue.poll();
            }
        }

        return priorityQueue.peek();
    }

}
