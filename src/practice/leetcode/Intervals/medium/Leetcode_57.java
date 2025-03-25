package practice.leetcode.Intervals.medium;

// Insert Interval
// https://leetcode.com/problems/insert-interval/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_57 {

    public static void main(String[] args) {
        int[][] insert = insert(new int[][]{{1,2}, {3,5}, {6,7}, {8,10}, {12,16}}, new int[]{4,8});

        for (int[] arr : insert){
            System.out.print(arr[0] + " ");
            System.out.print(arr[1]);
            System.out.println();
        }

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length, i = 0;
        List<int[]> res = new ArrayList<>();

        while (i < n && intervals[i][1] < newInterval[0]){
            res.add(intervals[i]);
            i++;
        }

        while (i < n && newInterval[1] >= intervals[i][0]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        res.add(newInterval);

        while (i < n){
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }

}
