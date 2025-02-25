package practice.leetcode.graphs.medium;

// Pacific Atlantic Water Flow
// https://leetcode.com/problems/pacific-atlantic-water-flow/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_417 {

    public static void main(String[] args) {
        System.out.println(pacificAtlantic(new int[][]{{1, 2, 2, 3, 5},{3, 2, 3, 4, 4},{2, 4, 5, 3, 1}}));
    }

    private static int[][] directions = {
            {1,0},{-1,0},{0,1},{0,-1}
    };

    public static List<List<Integer>> pacificAtlantic(int[][] heights) {
        int ROWS = heights.length, COLS = heights[0].length;

        boolean[][] pac = new boolean[ROWS][COLS];
        boolean[][] atl = new boolean[ROWS][COLS];

        for (int c = 0; c < COLS; c++){
            dfs(0, c, pac, heights);
            dfs(ROWS - 1, c, atl, heights);
        }

        for (int r = 0; r < ROWS; r++) {
            dfs(r, 0, pac, heights);
            dfs(r, COLS - 1, atl, heights);
        }

        List<List<Integer>> res = new ArrayList<>();

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (pac[r][c] && atl[r][c]){
                    res.add(Arrays.asList(r,c));
                }
            }
        }

        return res;
    }

    private static void dfs(int r, int c, boolean[][] ocean, int[][] heights){
        ocean[r][c] = true;

        for (int[] d : directions){
            int nr = r + d[0], nc = c + d[1];

            if (nr >= 0 && nc >= 0 && nr < heights.length && nc < heights[0].length && !ocean[nr][nc] && heights[nr][nc] >= heights[r][c]){
                dfs(nr,nc, ocean, heights);
            }

        }
    }

}
