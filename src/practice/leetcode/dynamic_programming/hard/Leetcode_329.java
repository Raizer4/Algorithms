package practice.leetcode.dynamic_programming.hard;

// Longest Increasing Path in a Matrix
// https://leetcode.com/problems/longest-increasing-path-in-a-matrix/description/

public class Leetcode_329 {

    public static void main(String[] args) {
        System.out.println(longestIncreasingPath(new int[][]{{9,9,4},{6,6,8},{2,1,1}}));
    }

    private static int[][] directions = {{-1,0},{1,0},{0,-1},{0,1}};
    private static int[][] dp;

    public static int longestIncreasingPath(int[][] matrix) {
        int ROWS = matrix.length, COLS = matrix[0].length;
        int LIP = 0;

        dp = new int[ROWS][COLS];

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                dp[i][j] = -1;
            }
        }

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                LIP = Math.max(LIP, dfs(matrix,r,c,Integer.MIN_VALUE));
            }
        }

        return LIP;
    }

    private static int dfs(int[][] matrix, int r, int c, int prevVal){
        int ROWS = matrix.length, COLS = matrix[0].length;

        if (r < 0 || r >= ROWS || c < 0 || c >= COLS || matrix[r][c] <= prevVal) {
            return 0;
        }

        if (dp[r][c] != -1){
            return dp[r][c];
        }

        int res = 1;

        for (int[] d : directions){
            res = Math.max(res, 1 + dfs(matrix,r + d[0], c + d[1], matrix[r][c]));
        }

        return dp[r][c] = res;
    }

}
