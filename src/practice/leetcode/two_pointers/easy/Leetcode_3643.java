package practice.leetcode.two_pointers.easy;

// Flip Square Submatrix Vertically
// https://leetcode.com/problems/flip-square-submatrix-vertically/description/

public class Leetcode_3643 {

    public static void main(String[] args) {
        System.out.println(reverseSubmatrix(new int[][]{{4,20,8,20}, {2,16,3,12}, {3,12,17,1}, {3,13,2,13}}, 1, 1, 1));
    }

    public static int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int i = x;
        int j = x + k <= grid.length - 1 ? x + k : grid.length;

        int l = y;
        int r = (y + k) <= grid[0].length - 1 ? y + k : grid[0].length;

        while (i < j - 1){
            for (int m = l; m < r; m++) {
                int temp = grid[i][m];
                grid[i][m] = grid[j - 1][m];
                grid[j - 1][m] = temp;
            }
            i++;
            j--;
        }

        return grid;
    }

}
