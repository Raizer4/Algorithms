package practice.leetcode.leetcode_75.decision.day_18.similar;

// Find the Pivot Integer
// https://leetcode.com/problems/find-the-pivot-integer/description/

public class Leetcode_2485 {

    public static void main(String[] args) {
        System.out.println(pivotInteger(8));
        System.out.println(pivotInteger(1));
        System.out.println(pivotInteger(4));
    }

    public static int pivotInteger(int n) {
        int totalSum = n * (n + 1) / 2;
        int leftSum = 0;

        for (int x = 1; x <= n; x++) {
            leftSum += x;
            int rightSum = totalSum - leftSum + x;

            if (rightSum == leftSum) {
                return x;
            }
        }

        return -1;
    }



}
