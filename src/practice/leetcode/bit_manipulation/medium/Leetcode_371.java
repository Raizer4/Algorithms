package practice.leetcode.bit_manipulation.medium;

// Sum of Two Integers
// https://leetcode.com/problems/sum-of-two-integers/description/

public class Leetcode_371 {

    public static void main(String[] args) {
        System.out.println(getSum(2,3));
    }

    public static int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sumWithoutCarry = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sumWithoutCarry, carry);
    }

}
