package practice.leetcode.graphs.medium;

// Number of Islands
// https://leetcode.com/problems/number-of-islands/description/

public class Leetcode_200 {

    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{
                {'1','1','1'},
                {'0','1','0'},
                {'0','1','0'},
        }));
    }

    private static int ROW, COL;
    private static boolean[][] visited;

    public static int numIslands(char[][] grid) {
        int count = 0;

        ROW = grid.length;
        COL = grid[0].length;

        visited = new boolean[ROW][COL];

        for (int r = 0; r < ROW; r++) {
            for (int c = 0; c < COL; c++) {
                if (dfs(grid,r,c)){
                    count++;
                }
            }
        }

        return count;
    }

    private static boolean dfs(char[][] grid, int r, int c){
        if (r < 0 || c < 0 || r >= ROW || c >= COL || visited[r][c] || grid[r][c] == '0'){return false;}

        visited[r][c] = true;

        boolean temp_1 = dfs(grid, r + 1, c);
        boolean temp_2 = dfs(grid, r - 1, c);
        boolean temp_3 = dfs(grid, r, c + 1);
        boolean temp_4 = dfs(grid, r, c - 1);


        if (grid[r][c] == '1'){return true;}

        if (temp_1 || temp_2 || temp_3 || temp_4){
            return true;
        }else {
            return false;
        }
    }

}
