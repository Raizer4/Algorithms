package practice.leetcode.backtracking.hard;

// N-Queens
// https://leetcode.com/problems/n-queens/description/

import java.util.*;

public class Leetcode_51 {

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }

    private static Set<Integer> col = new HashSet<>();
    private static Set<Integer> posDiag = new HashSet<>();
    private static Set<Integer> negDiag = new HashSet<>();
    private static List<List<String>> res = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for (char[] row : board){
            Arrays.fill(row, '.');
        }

        dfs(0,n,board);
        return res;
    }

    private static void dfs(int r, int n, char[][] board){
        if (r == n){
            List<String> copy = new ArrayList<>();
            for (char[] row : board) {
                copy.add(new String(row));
            }
            res.add(copy);
            return;
        }

        for (int c = 0; c < n; c++){
            if (col.contains(c) || posDiag.contains(r + c) || negDiag.contains(r - c)) {
                continue;
            }

            col.add(c);
            posDiag.add(r + c);
            negDiag.add(r - c);
            board[r][c] = 'Q';

            dfs(r + 1, n, board);

            col.remove(c);
            posDiag.remove(r + c);
            negDiag.remove(r - c);
            board[r][c] = '.';
        }

    }

}
