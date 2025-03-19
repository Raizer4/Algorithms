package practice.leetcode.dynamic_programming.medium;

// Unique Paths
// https://leetcode.com/problems/unique-paths/description/

import java.util.Arrays;

public class Leetcode_62 {

    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }

    public static int uniquePaths(int m, int n) {
        int[][] matrix = new int[m][n];

        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        matrix[0] = arr;

        for (int i = 1; i < m; i++){
            matrix[i][0] = 1;
            for (int j = 1; j < n; j++){
                matrix[i][j] = matrix[i - 1][j] + matrix[i][j - 1];
            }
        }

        return matrix[m - 1][n - 1];
    }

}
