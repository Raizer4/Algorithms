package practice.leetcode.Intervals.medium;

// Minimum Number of Arrows to Burst Balloons
// https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;
import java.util.Comparator;

public class Leetcode_452 {

    public static void main(String[] args) {
        System.out.println(findMinArrowShots(new int[][]{{1,6}, {2,8}, {7,12}, {10,16}}));
    }

    public static int findMinArrowShots(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        int arrows = 1;
        int currentEnd = points[0][1];

        for (int i = 1; i < points.length; i++) {
            int start = points[i][0];
            int end = points[i][1];

            if (start > currentEnd){
                arrows++;
                currentEnd = end;
            }else {
                currentEnd = Math.min(currentEnd,end);
            }
        }

        return arrows;
    }

}
