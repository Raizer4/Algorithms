package practice.leetcode.dynamic_programming.easy;

// Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/description/

public class Leetcode_70 {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(7));
    }

    public static int climbStairs(int n) {
        if (n <= 2){
            return n;
        }

        int[] arr = new int[n + 1];

        arr[1] = 1;
        arr[2] = 2;

        for (int i = 3; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }


        return arr[n];
    }

}
