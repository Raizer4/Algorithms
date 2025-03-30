package practice.leetcode.bit_manipulation.medium;

// Reverse Integer
// https://leetcode.com/problems/reverse-integer/description/

public class Leetcode_7 {

    public static void main(String[] args) {
        System.out.println(reverse(5));
    }

    public static int reverse(int x) {
        final int MIN = -2147483648;
        final int MAX = 2147483647;

        int res = 0;

        while (x != 0){
            int digit = x % 10;
            x /= 10;

            if (res > MAX / 10 || (res == MAX / 10 && digit > MAX % 10))
                return 0;
            if (res < MIN / 10 || (res == MIN / 10 && digit < MIN % 10))
                return 0;

            res = (res * 10) + digit;
        }


        return res;
    }

}
