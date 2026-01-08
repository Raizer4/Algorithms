package practice.leetcode.array.medium;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_289 {

    public static void main(String[] args) {
        gameOfLife(new int[][]{
                {0,1,0},
                {0,0,1},
                {1,1,1},
                {0,0,0}
        });
    }

    public static void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int dead = 0;
                int alive = 0;

                if (i + 1 < m && j + 1 < n){
                    if (board[i + 1][j + 1] == 0){
                        dead++;
                    }else {
                        alive++;
                    }
                }

                if (i + 1 < m){
                    if (board[i + 1][j] == 0){
                        dead++;
                    }else {
                        alive++;
                    }
                }

                if (i + 1 < m && j - 1 >= 0){
                    if (board[i + 1][j - 1] == 0){
                        dead++;
                    }else {
                        alive++;
                    }
                }

                if (j + 1 < n){
                    if (board[i][j + 1] == 0){
                        dead++;
                    }else {
                        alive++;
                    }
                }

                if (j - 1 >= 0){
                    if (board[i][j - 1] == 0){
                        dead++;
                    }else {
                        alive++;
                    }
                }

                if (i - 1 >= 0 && j - 1 >= 0){
                    if (board[i - 1][j - 1] == 0){
                        dead++;
                    }else {
                        alive++;
                    }
                }

                if (i - 1 >= 0){
                    if (board[i - 1][j] == 0){
                        dead++;
                    }else {
                        alive++;
                    }
                }

                if (i - 1 >= 0 && j + 1 < n){
                    if (board[i + 1][j + 1] == 0){
                        dead++;
                    }else {
                        alive++;
                    }
                }

                if (board[i][j] == 0){
                    if (alive == 3){
                        list.add(new int[]{i, j, 1});
                    }
                }else {
                    if (alive < 2 || alive >= 4){
                        list.add(new int[]{i, j, 0});
                    }
                }


            }
        }

        for (int[] arr : list){
            board[arr[0]][arr[1]] = arr[2];
        }

    }

}
