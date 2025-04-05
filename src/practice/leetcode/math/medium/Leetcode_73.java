package practice.leetcode.math.medium;

// Set Matrix Zeroes
// https://leetcode.com/problems/set-matrix-zeroes/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_73 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        setZeroes(matrix);

        for (int[] arr : matrix){
            for (int temp : arr){
                System.out.print(temp + " ");
            }
            System.out.println();
        }

    }

    private static int ROW;
    private static int COL;

    public static void setZeroes(int[][] matrix) {
        List<int[]> list = new ArrayList<>();

        ROW = matrix.length;
        COL = matrix[0].length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new int[]{i, j});
                }
            }
        }

        for (int[] arr : list){
            dfs(matrix, arr[0], arr[1], 0, 1);
            dfs(matrix, arr[0], arr[1], 0, -1);
            dfs(matrix, arr[0], arr[1], 1, 0);
            dfs(matrix, arr[0], arr[1], -1, 0);
        }

    }

    private static void dfs(int[][] matrix, int i, int j, int c, int r){
        if (i < 0 || j < 0 || i >= ROW || j >= COL){
            return;
        }

        matrix[i][j] = 0;

        dfs(matrix, i + c, j + r, c, r);
    }

}
