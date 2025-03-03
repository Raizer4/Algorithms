package practice.leetcode.hash_table.easy;

// Find Winner on a Tic Tac Toe Game
// https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/description/

public class Leetcode_1275 {

    public static void main(String[] args) {
        int[][] coordinates = {
                {2, 0},
                {1, 1},
                {0, 2},
                {2, 1},
                {1, 2},
                {1, 0},
                {0, 0},
                {0, 1}
        };

        System.out.println(tictactoe(coordinates));
    }

    public static String tictactoe(int[][] moves) {
        char[][] res = new char[3][3];

        char x = 'x';
        char o = 'o';

        int i = 0;

        for (int[] arr : moves) {
            if (i % 2 == 0){
                res[arr[0]][arr[1]] = x;
                if (diagonalChecker(res,x) || adjacentChecker(res,x)){
                    return "A";
                }
            }else {
                res[arr[0]][arr[1]] = o;
                if (diagonalChecker(res,o) || adjacentChecker(res,o)){
                    return "B";
                }
            }
            i++;
        }

        if (i != 9){
            return "Pending";
        }

        return "Draw";

    }

    private static boolean diagonalChecker(char[][] res, char t){
        return mainDiagonal(res, t) || sideDiagonal(res, t);
    }

    private static boolean adjacentChecker(char[][] res, char t){
        return verticalAdjacent(res,t) || horizontalAdjacent(res,t);
    }


    private static boolean mainDiagonal(char[][] res, char t){
        for (int i = 0; i < res.length; i++){
            if (res[i][i] != t){
                return false;
            }
        }
        return true;
    }

    private static boolean sideDiagonal(char[][] res, char t){
        for (int i = 0; i < res.length; i++){
            if (res[i][res.length - i - 1] != t){
                return false;
            }
        }
        return true;
    }

    private static boolean verticalAdjacent(char[][] res, char t) {
        int i = 0;

        while (i < res.length) {
            if (res[0][i] == t && res[1][i] == t && res[2][i] == t) {
                return true;
            }
            i++;
        }

        return false;
    }

    private static boolean horizontalAdjacent(char[][] res, char t){
        for (char[] arr : res){
            if (arr[0] == t && arr[1] == t && arr[2] == t){
                return true;
            }
        }

        return false;
    }


}
