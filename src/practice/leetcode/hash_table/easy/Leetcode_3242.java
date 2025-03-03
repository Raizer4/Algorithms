package practice.leetcode.hash_table.easy;

// Design Neighbor Sum Service
// https://leetcode.com/problems/design-neighbor-sum-service/description/

public class Leetcode_3242 {

    static class NeighborSum {
       public int[][] grid;

        public NeighborSum(int[][] grid) {
            this.grid = grid;
        }

        public int adjacentSum(int value) {
            int sum = 0;

            for (int i = 0; i < grid.length; i++){
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == value){
                        if (i - 1 != -1){
                            sum += grid[i - 1][j];
                        }
                        if (i + 1 != grid.length){
                            sum += grid[i + 1][j];
                        }
                        if (j - 1 != -1){
                            sum += grid[i][j - 1];
                        }
                        if (j + 1 != grid[i].length){
                            sum += grid[i][j + 1];
                        }
                    }
                }
            }

            return sum;
        }

        public int diagonalSum(int value) {
            int sum = 0;

            for (int i = 0; i < grid.length; i++){
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == value){

                        if (i + 1 != grid.length && j + 1 != grid[i].length){
                            sum += grid[i + 1][j + 1];
                        }

                        if (i - 1 != -1 && j -1 != -1){
                            sum += grid[i - 1][j - 1];
                        }

                        if (j - 1 != -1 && i + 1 != grid.length){
                            sum += grid[i + 1][j - 1];
                        }

                        if (j + 1 != grid[i].length && i - 1 != -1){
                            sum += grid[i - 1][j + 1];
                        }
                    }
                }
            }

            return sum;
        }

    }

    public static void main(String[] args) {
        int[][] grid1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        NeighborSum neighborSum = new NeighborSum(grid1);

        System.out.println(neighborSum.adjacentSum(8));
        System.out.println(neighborSum.adjacentSum(4));
        System.out.println(neighborSum.adjacentSum(1));

        System.out.println(neighborSum.diagonalSum(4));

    }

}
