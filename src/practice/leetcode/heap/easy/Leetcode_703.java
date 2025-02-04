package practice.leetcode.heap.easy;

// Kth Largest Element in a Stream
// https://leetcode.com/problems/kth-largest-element-in-a-stream/description/

import java.util.PriorityQueue;

public class Leetcode_703 {

    public static void main(String[] args) {
        KthLargest kthLargest = new KthLargest(4, new int[]{7, 7, 7, 7, 8, 3});
        kthLargest.add(2);
        kthLargest.add(10);
        kthLargest.add(9);
        kthLargest.add(9);
    }

    static class KthLargest {
        private static PriorityQueue<Integer> minHeap;
        private int k;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            this.minHeap = new PriorityQueue<>();

            for (int num : nums){
                minHeap.offer(num);
                if (minHeap.size() > k){
                    minHeap.poll();
                }
            }
        }

        public int add(int val) {
            minHeap.offer(val);
            if (minHeap.size() > k){
                 minHeap.poll();
            }
            return minHeap.peek();
        }

    }

}
