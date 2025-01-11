package practice.leetcode.binary_search.easy;

// Guess Number Higher or Lower
// https://leetcode.com/problems/guess-number-higher-or-lower/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_374 {

    public static void main(String[] args) {
        System.out.println(4);
    }

    public static int guessNumber(int n) {
        int l = 1;
        int r = n;

        while (l <= r){
            int m = l + (r - l);

            int temp = guess(m);

            if (temp == 0){
                return m;
            }else if (temp == 1) {
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        return -1;
    }

    private static int guess(int n){
        if (n == 10){
            return 0;
        }else if (n < 10){
            return 1;
        }else {
            return -1;
        }
    }

}
