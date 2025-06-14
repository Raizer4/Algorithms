package practice.leetcode.two_pointers.medium;

// Minimum Number of Flips to Make Binary Grid Palindromic I
// https://leetcode.com/problems/minimum-number-of-flips-to-make-binary-grid-palindromic-i/description/

public class Leetcode_3239 {

    public static void main(String[] args) {
        System.out.println(minFlips(new int[][]{{1,0,1},{1,0,0}}));
    }

    public static int minFlips(int[][] grid) {
        int num = 0;

        int row = 0;
        int col = 0;

        while (num < grid[0].length){
            int l = 0;
            int r = grid.length - 1;

            while (l <= r){
                if (grid[l][num] != grid[r][num]){
                    row++;
                }
                l++;
                r--;
            }

            num++;
        }

        for (int[] arr : grid){
            int l = 0;
            int r = arr.length - 1;

            while (l <= r){
                if (arr[l] != arr[r]){
                    col++;
                }
                l++;
                r--;
            }

        }

        return Math.min(col,row);
    }

}
