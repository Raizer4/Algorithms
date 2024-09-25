package practice.leetcode.leetcode_75.day_6;

// Equal Row and Column Pairs
// https://leetcode.com/problems/equal-row-and-column-pairs/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_2352 {

    public static void main(String[] args) {
        int[][] grid1 = {
                {3, 2, 1},
                {1, 7, 6},
                {2, 7, 7}
        };

        int[][] grid2 = {
                {3, 1, 2, 2},
                {1, 4, 4, 5},
                {2, 4, 2, 2},
                {2, 4, 2, 2}
        };

        System.out.println(equalPairs(grid1)); // Ожидается: 1
        System.out.println(equalPairs(grid2)); // Ожидается: 3
    }

    public static int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                boolean isEqual = true;

                for (int k = 0; k < n; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        isEqual = false;
                        break;
                    }
                }

                if (isEqual) {
                    count++;
                }

            }
        }

        return count;
    }

}
