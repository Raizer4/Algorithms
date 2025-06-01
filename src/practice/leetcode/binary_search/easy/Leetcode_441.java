package practice.leetcode.binary_search.easy;

// Arranging Coins
// https://leetcode.com/problems/arranging-coins/description/

public class Leetcode_441 {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(1804289383));
    }

    public static int arrangeCoins(int n) {
        int l = 1;
        int r = n;

        int res = 0;

        while (l <= r){
            int m = l + (r - l) / 2;
            long total = (long) m * (m + 1) / 2;

            if (total == n){
                return m;
            } else if (total > n) {
                r = m - 1;
            }else {
                res = m;
                l = m + 1;
            }

        }

        return res;
    }

}
