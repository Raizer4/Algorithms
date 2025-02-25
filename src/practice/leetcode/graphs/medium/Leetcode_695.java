package practice.leetcode.graphs.medium;

// Max Area of Island
// https://leetcode.com/problems/max-area-of-island/description/

public class Leetcode_695 {

    public static void main(String[] args) {
        System.out.println(maxAreaOfIsland(new int[][]{
                {1,1,1,1,0},
                {1,1,0,1,0},
                {1,1,0,0,0},
                {1,1,0,0,0},
                {0,0,0,0,0},
        }));
    }

    private static int res = 0;
    private static int ROW, COL;
    private static boolean[][] visited;

    public static int maxAreaOfIsland(int[][] grid) {
        ROW = grid.length;
        COL = grid[0].length;

        visited = new boolean[ROW][COL];

        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                int dfs = dfs(grid, r, c);
                res = Math.max(res,dfs);
            }
        }

        return res;
    }

    private static int dfs(int[][] grid, int r, int c){
        if (r < 0 || c < 0 || r >= ROW || c >= COL || visited[r][c] || grid[r][c] == 0){
            return 0;
        }

        visited[r][c] = true;

        int temp = 1;

        temp += dfs(grid, r + 1, c);
        temp += dfs(grid, r - 1, c);
        temp += dfs(grid, r, c + 1);
        temp += dfs(grid, r, c - 1);

        return temp;
    }

}
