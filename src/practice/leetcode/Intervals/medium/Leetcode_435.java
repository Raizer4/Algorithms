package practice.leetcode.Intervals.medium;

// Non-overlapping Intervals
// https://leetcode.com/problems/non-overlapping-intervals/description/

import java.util.Arrays;

public class Leetcode_435 {

    public static void main(String[] args) {
        System.out.println(eraseOverlapIntervals(new int[][]{{1,100},{11,22},{1,11},{2,12}}));
    }

    private static int[] memo;

    public static int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int res = 0;
        int prevEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (start >= prevEnd) {
                prevEnd = end;
            } else {
                res++;
                prevEnd = Math.min(end, prevEnd);
            }
        }
        return res;
    }



}
