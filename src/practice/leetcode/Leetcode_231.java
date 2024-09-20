package practice.leetcode;

// Power of Two
// https://leetcode.com/problems/power-of-two/description/

public class Leetcode_231 {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(15));
    }

    public static boolean isPowerOfTwo(int n) {
        if (n == 1){
            return true;
        }

        while (n > 3){
            if (n%2!=0) {
                return false;
            }
            n = n/2;
        }

        return n == 2;
    }

}
