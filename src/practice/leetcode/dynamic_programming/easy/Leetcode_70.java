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

        int prev1 = 1;
        int prev2 = 2;
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }

        return current;
    }

}
