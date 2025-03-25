package practice.leetcode.Intervals.medium;

// Merge Intervals
// https://leetcode.com/problems/merge-intervals/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Leetcode_56 {

    public static void main(String[] args) {
        System.out.println(merge(new int[][]{{1,3},{2,6},{8,10},{15,18}}));
    }

    public static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1){
            return intervals;
        }

        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> list = new ArrayList<>();
        int[] currentInterval = intervals[0];
        list.add(currentInterval);

        for (int[] arr : intervals){
            int currentEnd = currentInterval[1];
            int nextStart = arr[0];
            int nextEnd = arr[1];

            if (nextStart <= currentEnd){
                currentInterval[1] = Math.max(nextEnd,currentEnd);
            }else {
                currentInterval = arr;
                list.add(currentInterval);
            }
        }

        return list.toArray(new int[list.size()][]);
    }

}
