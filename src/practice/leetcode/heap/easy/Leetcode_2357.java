package practice.leetcode.heap.easy;

//
//


import java.util.PriorityQueue;

public class Leetcode_2357 {

    public static void main(String[] args) {

    }

    public static int minimumOperations(int[] nums) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int temp : nums){
            priorityQueue.add(temp);
        }

        priorityQueue.poll();
        int count = 0;

        while (true){
            boolean flag = true;
            Integer peek = priorityQueue.peek();

            for (int temp : priorityQueue){
                if (temp > 0){
                    priorityQueue.add(temp - peek);
                    flag = false;
                }
            }

            count++;

            if (flag){
                return count;
            }
        }


    }

}
