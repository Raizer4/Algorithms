package practice.leetcode.graphs.medium;

// Surrounded Regions
// https://leetcode.com/problems/surrounded-regions/description/

public class Leetcode_130 {

    public static void main(String[] args) {
        char[][] chars = {
                {'X','X','X','X'},
                {'X','O','O','X'},
                {'X','X','O','X'},
                {'X','O','X','X'}
        };

        solve(chars);

        for (char[] temp : chars){
            for (char c : temp){
                System.out.print(c + " ");
            }
            System.out.println();
        }

    }

    private static int ROWS;
    private static int COLS;

    public static void solve(char[][] board) {
        ROWS = board.length;
        COLS = board[0].length;

        for (int r = 0; r < ROWS; r++) {
            if (board[r][0] == 'O'){
                dfs(board,r,0);
            }
            if (board[r][COLS - 1] == 'O'){
                dfs(board,r,COLS - 1);
            }
        }

        for (int c = 0; c < COLS; c++) {
            if (board[0][c] == 'O'){
                dfs(board,0,c);
            }

            if (board[ROWS - 1][c] == 'O'){
                dfs(board,ROWS - 1, c);
            }
        }

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (board[r][c] == 'O'){
                    board[r][c] = 'X';
                }

                if (board[r][c] == 'T'){
                    board[r][c] = 'O';
                }

            }
        }

    }

    private static void dfs(char[][] board, int r, int c){
        if (r < 0 || c < 0 || r >= ROWS ||
                c >= COLS || board[r][c] != 'O') {
            return;
        }

        board[r][c] = 'T';

        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }

}
