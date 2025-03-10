package practice.leetcode.dynamic_programming.easy;

// Pascal's Triangle
// https://leetcode.com/problems/pascals-triangle/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_118 {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();

         if (numRows == 0){
             return triangle;
         }

         List<Integer> firstRow = new ArrayList<>();
         firstRow.add(1);
         triangle.add(firstRow);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> prevRow = new ArrayList<>(triangle.get(rowNum - 1));
            List<Integer> currentRow = new ArrayList<>();

            List<Integer> extendedRow = new ArrayList<>();
            extendedRow.add(0);
            extendedRow.addAll(new ArrayList<>(prevRow));
            extendedRow.add(0);

            for (int i = 0; i < extendedRow.size() - 1; i++) {
                currentRow.add(extendedRow.get(i) + extendedRow.get(i + 1));
            }


            triangle.add(currentRow);
        }

        return triangle;
    }

}
