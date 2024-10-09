package practice.leetcode.math.easy;

// Power of Two
// https://leetcode.com/problems/power-of-two/description/

public class Leetcode_231 {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(15));
    }

    public static boolean isPowerOfTwo(int n) {
        while (n % 2 == 0  && n != 1 && n != 0){
            n /= 2;
        }

        return n == 1;
    }

}
