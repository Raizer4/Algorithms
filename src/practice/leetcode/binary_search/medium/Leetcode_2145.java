package practice.leetcode.binary_search.medium;

// Count the Hidden Sequences
// https://leetcode.com/problems/count-the-hidden-sequences/description/

public class Leetcode_2145 {

    public static void main(String[] args) {
        System.out.println(numberOfArrays(new int[]{3,-4,5,1,-2}, -4, 5));
    }

    public static int numberOfArrays(int[] differences, int lower, int upper) {
        long first = Long.MAX_VALUE, second = Long.MIN_VALUE;
        long l = lower, r = upper;

        while (l <= r) {
            long m = l + (r - l) / 2;
            long res = check(m, differences, lower, upper);
            if (res == 0) {
                first = Math.min(first, m);
                r = m - 1;
            } else if (res == -1) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        l = lower; r = upper;
        while (l <= r) {
            long m = l + (r - l) / 2;
            long res = check(m, differences, lower, upper);
            if (res == 0) {
                second = Math.max(second, m);
                l = m + 1;
            } else if (res == -1) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        if (first == Long.MAX_VALUE || second == Long.MIN_VALUE || first > second) {
            return 0;
        }

        return (int)(second - first + 1);
    }

    private static long check(long num, int[] differences, int lower, int upper) {
        long answer = num;
        for (int temp : differences) {
            answer += temp;
            if (answer < lower) return -1;
            if (answer > upper) return 1;
        }
        return 0;
    }

}
