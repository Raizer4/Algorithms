package practice.leetcode.math.medium;

// Spiral Matrix
// https://leetcode.com/problems/spiral-matrix/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_54 {

    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3},{4,5,6},{7,8,9}}));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        List<Integer> res = new ArrayList<>();

        dfs(m, n, 0, -1, 0, 1, matrix, res);
        return res;
    }

    private static void dfs(int row, int col, int r, int c,
                            int dr, int dc, int[][] matrix, List<Integer> res){

        if (row == 0 || col == 0){return;}

        for (int i = 0; i < col; i++) {
            r += dr;
            c += dc;
            res.add(matrix[r][c]);
        }

        dfs(col, row - 1, r, c, dc,-dr, matrix, res);
    }

}
