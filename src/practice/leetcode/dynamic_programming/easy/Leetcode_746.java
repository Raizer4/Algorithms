package practice.leetcode.dynamic_programming.easy;

// Min Cost Climbing Stairs
// https://leetcode.com/problems/min-cost-climbing-stairs/description/

public class Leetcode_746 {

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1,100,1,1,1,100,1,1,100,1}));
    }

    public static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;

        int[] arr = new int[n + 2];
        arr[0] = cost[0];
        arr[1] = cost[1];

        for (int i = 2; i < n; i++) {
          arr[i] = cost[i] + Math.min(arr[i - 1], arr[i - 2]);
        }

        return Math.min(arr[n - 1], arr[n - 2]);
    }

}
