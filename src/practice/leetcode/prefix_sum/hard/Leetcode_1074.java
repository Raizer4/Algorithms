package practice.leetcode.prefix_sum.hard;

// Number of Submatrices That Sum to Target
// https://leetcode.com/problems/number-of-submatrices-that-sum-to-target/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_1074 {

    public static void main(String[] args) {
        System.out.println(numSubmatrixSumTarget(new int[][]{
                {0,1,0},
                {1,1,1},
                {0,1,0}}, 0));
    }

    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;


        int[][] prefix = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefix[i][j] = matrix[i-1][j-1] + prefix[i-1][j] + prefix[i][j-1] - prefix[i-1][j-1];
            }
        }

        int count = 0;


        for (int r1 = 1; r1 <= rows; r1++) {
            for (int r2 = r1; r2 <= rows; r2++) {
                Map<Integer, Integer> map = new HashMap<>();
                map.put(0, 1);

                for (int j = 1; j <= cols; j++) {
                    int currentSum = prefix[r2][j] - prefix[r1-1][j];
                    count += map.getOrDefault(currentSum - target, 0);
                    map.put(currentSum, map.getOrDefault(currentSum, 0) + 1);
                }
            }
        }

        return count;
    }

}
