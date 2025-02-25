package practice.leetcode.graphs.medium;

// Nearest Exit from Entrance in Maze
// https://leetcode.com/problems/nearest-exit-from-entrance-in-maze/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayDeque;
import java.util.Queue;

public class Leetcode_1926 {

    public static void main(String[] args) {
        System.out.println(nearestExit(new char[][]{{'+', '+' ,'+'},{'.', '.', '.'},{'+', '+', '+'}},  new int[]{1,0}));
    }

    private static int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    private static int ROWS;
    private static int COLS;

    public static int nearestExit(char[][] maze, int[] entrance) {
        ROWS = maze.length;
        COLS = maze[0].length;

        int r = entrance[0];
        int c = entrance[1];

        int res = -1;

        for (int[] temp : directions){
            int nr = r + temp[0];
            int nc = c + temp[1];

            if (nr < 0 || nc < 0 || nr >= ROWS || nc >= COLS || maze[nr][nc] == '+'){
                continue;
            }

            boolean[][] visited = new boolean[ROWS][COLS];
            visited[r][c] = true;

            int bfs = bfs(maze, nr, nc, visited);

            if (bfs != -1){
                if (res == -1){
                    res = bfs;
                }else {
                    res = Math.min(res, bfs);
                }
            }

        }


        return res;
    }


    private static int bfs(char[][] maze, int r, int c, boolean[][] visited){
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{r, c});
        visited[r][c] = true;

        int steps = 1;

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int[] poll = queue.poll();

                int row = poll[0], col = poll[1];

                if (row < 0 || col < 0 || row >= ROWS || col >= COLS){
                    return steps;
                }

                for (int[] arr : directions){
                    int nr = row + arr[0];
                    int nc = col + arr[1];

                    if (nr < 0 || nc < 0 || nr >= ROWS || nc >= COLS) {
                        return steps;
                    }

                    if (maze[nr][nc] == '.' && !visited[nr][nc]){
                        queue.add(new int[]{nr,nc});
                        visited[nr][nc] = true;
                    }

                }

            }

            steps++;
        }

        return -1;
    }

}
