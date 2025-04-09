package practice.leetcode.array.easy;

// Minimum Absolute Difference
// https://leetcode.com/problems/minimum-absolute-difference/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_1200 {

    public static void main(String[] args) {
        System.out.println(minimumAbsDifference(new int[]{4,2,1,3}));
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, Math.abs(arr[i - 1] - arr[i]));
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            int abs = Math.abs(arr[i - 1] - arr[i]);
            if (abs == min){
                res.add(Arrays.asList(arr[i - 1], arr[i]));
            }
        }

        return res;
    }

}
