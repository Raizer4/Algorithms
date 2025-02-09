package practice.leetcode.heap.medium;

// Maximum Subsequence Score
// https://leetcode.com/problems/maximum-subsequence-score/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_2542 {

    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{2,1,14,12}, new int[]{11,7,13,6}, 3));
    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        int[][] base = new int[nums1.length][2];

        for (int i = 0; i < nums1.length; i++){
            int i1 = nums1[i];
            int i2 = nums2[i];

            int[] ints = {i1, i2};

            base[i] = ints;
        }

        Arrays.sort(base, (a,b) -> b[1] - a[1]);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue(k);
        int sum = 0;

        int max = 0;

        for (int[] arr : base){
            int num1 = arr[0];
            int num2 = arr[1];

            priorityQueue.add(num1);
            sum += num1;

            if (priorityQueue.size() > k){
                sum -= priorityQueue.poll();
            }

            if (priorityQueue.size() == k){
                max = Math.max(max, sum * num2);
            }

        }

        return max;
    }

}
