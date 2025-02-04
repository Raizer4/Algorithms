package practice.leetcode.heap.easy;

// Find Subsequence of Length K With the Largest Sum
// https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/description/

import java.util.HashMap;
import java.util.PriorityQueue;

public class Leetcode_2099 {

    public static void main(String[] args) {
        System.out.println(maxSubsequence(new int[]{2,1,3,3}, 2));
    }

    public static int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int temp : nums){
            priorityQueue.add(temp);

            if (priorityQueue.size() > k ){
                priorityQueue.poll();
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int temp : priorityQueue){
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        int[] res = new int[k];
        int i = 0;

        for (Integer temp : nums){
            if (map.containsKey(temp) && map.get(temp) > 0){
                map.put(temp, map.get(temp) - 1);
                res[i++] = temp;
            }
        }

        return res;
    }

}
