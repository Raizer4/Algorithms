package practice.leetcode.backtracking.medium;

// Word Search
// https://leetcode.com/problems/word-search/description/

public class Leetcode_79 {

    public static void main(String[] args) {
        System.out.println(exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCCED"));
    }

    private static int COLS, ROWS;
    private static boolean[][] visited;

    public static boolean exist(char[][] board, String word) {
        ROWS = board.length;
        COLS = board[0].length;
        visited = new boolean[ROWS][COLS];

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (dfs(board,0,c,r,word)){
                    return true;
                }
            }
        }

        return false;
    }

    private static boolean dfs(char[][] board, int i, int c, int r, String word){
        if (i == word.length()){
            return true;
        }

        if (r < 0 || c < 0 || r >= ROWS || c >= COLS || board[r][c] != word.charAt(i) || visited[r][c]){
            return false;
        }

        visited[r][c] = true;

        boolean res = dfs(board, i + 1,  c + 1, r, word) ||
                      dfs(board, i + 1, c - 1, r, word) ||
                      dfs(board, i + 1, c, r + 1, word) ||
                      dfs(board, i + 1, c, r - 1, word);

        visited[r][c] = false;

        return res;
    }


}
