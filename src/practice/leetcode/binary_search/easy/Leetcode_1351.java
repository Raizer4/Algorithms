package practice.leetcode.binary_search.easy;

// Count Negative Numbers in a Sorted Matrix
// https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_1351 {

    public static void main(String[] args) {
        System.out.println(countNegatives(new int[][] {{4,3,2,-1},{3,2,1,-1}, {1,1,-1,-2}, {-1,-1,-2,-3}}));
    }

    public static int countNegatives(int[][] grid) {
        List<Integer> list = new ArrayList<>();

        for (int[] temp : grid) {
            for (int c : temp) {
                list.add(c);
            }
        }

        Collections.sort(list);

        return countNegatives(list);
    }


    private static int countNegatives(List<Integer> list) {
        int l = 0;
        int r = list.size() - 1;

        int index = -1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (list.get(m) < 0) {
                index = m;
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return index + 1;
    }


}
