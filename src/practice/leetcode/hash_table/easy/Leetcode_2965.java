package practice.leetcode.hash_table.easy;

// Find Missing and Repeated Values
// https://leetcode.com/problems/find-missing-and-repeated-values/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_2965 {

    public static void main(String[] args) {

        int[][] grid1 = {
                {9,1,7},
                {8,9,2},
                {3,4,6}
        };

        int[] missingAndRepeatedValues = findMissingAndRepeatedValues(grid1);

        for (int temp : missingAndRepeatedValues){
            System.out.print(temp + " ");
        }

    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] res = new int[2];

        List<Integer> list = new ArrayList<>();

        for (int[] arr : grid){
            for (int temp : arr){
                if (!list.contains(temp)){
                    list.add(temp);
                }else {
                    res[0] = temp;
                }
            }
        }

        Collections.sort(list);

        int n = list.size() + 1;
        int expectedSum = (n * (n + 1)) / 2;
        int actualSum = 0;

        for (int num : list) {
            actualSum += num;
        }

        res[1] = expectedSum - actualSum;

        return res;
    }

}
