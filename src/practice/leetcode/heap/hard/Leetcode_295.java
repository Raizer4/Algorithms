package practice.leetcode.heap.hard;

// Find Median from Data Stream
// https://leetcode.com/problems/find-median-from-data-stream/description/

import java.util.PriorityQueue;
import java.util.Queue;

public class Leetcode_295 {

    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1); // arr = [1]
        medianFinder.addNum(2); // arr = [1, 2]
        System.out.println(medianFinder.findMedian()); // возвращает 1,5 (т. е. (1 + 2) / 2)
        medianFinder.addNum(3); // arr[1, 2, 3]
        System.out.println( medianFinder.findMedian()); // возвращает 2,0
    }

    static class MedianFinder {
        private Queue<Integer> smallHeap;
        private Queue<Integer> largeHeap;

        public MedianFinder() {
            smallHeap = new PriorityQueue<>((a, b) -> b - a);
            largeHeap = new PriorityQueue<>((a, b) -> a - b);
        }

        public void addNum(int num) {
            smallHeap.add(num);

            if (smallHeap.size() - largeHeap.size() > 1 || !largeHeap.isEmpty() && smallHeap.peek() > largeHeap.peek()){
                largeHeap.add(smallHeap.poll());
            }

            if (largeHeap.size() - smallHeap.size() > 1){
                smallHeap.add(largeHeap.poll());
            }
        }

        public double findMedian() {
            if (smallHeap.size() == largeHeap.size()){
                return (double) (largeHeap.peek() + smallHeap.peek()) / 2;
            } else if (smallHeap.size() > largeHeap.size()) {
                return (double) smallHeap.peek();
            }else {
                return (double) largeHeap.peek();
            }
        }
    }

}
