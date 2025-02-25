package practice.leetcode.graphs.medium;

// Islands and Treasure
// https://neetcode.io/problems/islands-and-treasure

import java.util.*;

public class Leetcode_286 {

    public static void main(String[] args) {
        int[][] arr = new int[][]
                {
                        {2147483647,0,0,2147483647},
                        {2147483647,2147483647,2147483647,-1},
                        {2147483647,-1,2147483647,-1},
                        {0,-1,2147483647,2147483647}
                };

        islandsAndTreasure(arr);

        for (int[] temp : arr){
            for (int element : temp){
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }


    private static int[][] directions = {{1,0}, {-1,0},
                                         {0,1}, {0,-1}};
    private static int ROW;
    private static int COL;
    private static int INF = 2147483647;

    public static void islandsAndTreasure(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;

        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                if (grid[r][c] == INF){
                    grid[r][c] = bfs(grid, r, c);
                }
            }
        }
    }

    private static int bfs(int[][] grid, int r, int c){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{r,c});

        boolean[][] visit = new boolean[ROW][COL];

        visit[r][c] = true;

        int steps = 0;

        while (!q.isEmpty()){
            int size = q.size();

            for (int i = 0; i < size; i++) {
                int[] curr = q.poll();

                int row = curr[0], col = curr[1];

                if (grid[row][col] == 0){
                    return steps;
                }

                for (int[] dir : directions){
                    int nr = row + dir[0], nc = col + dir[1];
                    if (nr >= 0 && nr < ROW && nc >= 0 && nc < COL && !visit[nr][nc] && grid[nr][nc] != -1){
                        visit[nr][nc] = true;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
            steps++;
        }

        return INF;
    }

}
