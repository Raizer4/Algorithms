package practice.leetcode.binary_search.easy;

// Valid Perfect Square
// https://leetcode.com/problems/valid-perfect-square/description/

public class Leetcode_367 {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(5));
    }

    public static boolean isPerfectSquare(int num) {
        int l = 1;
        int r = num;

        while (l <= r){
            int m = l + (r - l) / 2;

            double pow = Math.pow(m, 2);

            if (pow == num){
                return true;
            } else if (pow > num) {
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return false;
    }

}
