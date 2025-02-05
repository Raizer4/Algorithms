package practice.leetcode.heap.easy;

// Make Array Zero by Subtracting Equal Amounts
// https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/description/



import java.util.PriorityQueue;

public class Leetcode_2357 {

    public static void main(String[] args) {
        System.out.println(minimumOperations(new int[]{1,5,0,3,5}));
    }

    public static int minimumOperations(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            if (num > 0) {
                priorityQueue.add(num);
            }
        }

        int count = 0;

        while (!priorityQueue.isEmpty()) {
            int min = priorityQueue.poll();
            count++;

            PriorityQueue<Integer> temp = new PriorityQueue<>();

            while (!priorityQueue.isEmpty()) {
                int num = priorityQueue.poll() - min;
                if (num > 0) {
                    temp.add(num);
                }
            }

            priorityQueue = temp;
        }

        return count;
    }

}
