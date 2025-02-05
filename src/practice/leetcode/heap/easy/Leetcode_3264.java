package practice.leetcode.heap.easy;

// Final Array State After K Multiplication Operations I
// https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/description/

import java.util.PriorityQueue;

public class Leetcode_3264 {

    public static void main(String[] args) {
        int[] finalState = getFinalState(new int[]{2, 1, 3, 5, 6}, 5, 2);

        for (int temp : finalState){
            System.out.print(temp + " ");
        }

    }

    public static int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>( (a, b) -> {
            if (a[0] == b[0]) return a[1] - b[1];
            return a[0] - b[0];
        });

        for (int i = 0; i < nums.length; i++){
            priorityQueue.add(new int[]{nums[i], i});
        }

        while (k != 0){
            int[] arr = priorityQueue.poll();
            arr[0] *= multiplier;
            priorityQueue.add(arr);
            k--;
        }


        for (int[] temp : priorityQueue){
            nums[temp[1]] = temp[0];
        }

        return nums;
    }

}
