package practice.leetcode.math.medium;

// Pow(x, n)
// https://leetcode.com/problems/powx-n/description/

public class Leetcode_50 {

    public static void main(String[] args) {
        System.out.println(myPow(2.00000, 10));
    }

    public static double myPow(double x, int n) {
        if (x == 0){
            return 0;
        }

        if (n == 0){
            return 1;
        }

        double res = helper(x, Math.abs((long) n));
        return (n >= 0) ? res : 1 / res;
    }

    private static double helper(double x, long n){
        if (n == 0){
            return 1;
        }

        double half = helper(x, n / 2);
        return (n % 2 == 0) ? half * half : x * half * half;
    }

}
