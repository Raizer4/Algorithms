package practice.leetcode.heap.medium;

// Total Cost to Hire K Workers
// https://leetcode.com/problems/total-cost-to-hire-k-workers/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_2462 {

    public static void main(String[] args) {
        System.out.println(totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3,4));
    }

    public static long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;

        PriorityQueue<int[]> leftPQ = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<int[]> rightPQ = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int left = 0, right = n - 1;


        while (left < candidates) {
            leftPQ.offer(new int[]{costs[left], left});
            left++;
        }


        while (right >= left && n - right <= candidates) {
            rightPQ.offer(new int[]{costs[right], right});
            right--;
        }

        long res = 0;


        while (k-- > 0) {
            if (!leftPQ.isEmpty() && (rightPQ.isEmpty() || leftPQ.peek()[0] <= rightPQ.peek()[0])) {
                res += leftPQ.poll()[0];

                if (left <= right) {
                    leftPQ.offer(new int[]{costs[left], left});
                    left++;
                }
            } else {
                res += rightPQ.poll()[0];

                if (left <= right) {
                    rightPQ.offer(new int[]{costs[right], right});
                    right--;
                }
            }
        }

        return res;
    }

}
