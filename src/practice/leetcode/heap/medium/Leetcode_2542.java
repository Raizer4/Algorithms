package practice.leetcode.heap.medium;

// Maximum Subsequence Score
// https://leetcode.com/problems/maximum-subsequence-score/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_2542 {

    public static void main(String[] args) {
        System.out.println(maxScore(new int[]{2,1,14,12}, new int[]{11,7,13,6}, 3));
    }

    public static long maxScore(int[] nums1, int[] nums2, int k) {
        int[][] pairs = new int[nums1.length][2];

        for (int i = 0; i < nums1.length; i++) {
            pairs[i] = new int[]{nums1[i], nums2[i]};
        }

        Arrays.sort(pairs, (a, b ) -> b[1] - a[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>(k);

        long sum = 0;
        long maxScore = 0;

        for (int[] pair : pairs) {
            int num1 = pair[0];
            int num2 = pair[1];

            pq.add(num1);
            sum += num1;

            if (pq.size() > k) {
                sum -= pq.poll();
            }

            if (pq.size() == k) {
                maxScore = Math.max(maxScore, sum * num2);
            }
        }

        return maxScore;
    }

}
