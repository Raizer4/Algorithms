package practice.leetcode.hash_table.medium;

// Equal Row and Column Pairs
// https://leetcode.com/problems/equal-row-and-column-pairs/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;

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
        int count = 0;
        int i = 0;
        int j = 0;

        while (i < grid.length){
           int[] temp = new int[grid.length];
           int index = 0;

            for (int[] arr : grid){
              temp[index++] = arr[j];
            }

            int check = check(grid, temp);

            if (check != 0){
                count += check;
            }

            j++;
            i++;
        }

        return count;
    }

    private static int check(int[][] res, int [] temp){
        int count = 0;

        for (int[] ints : res){
            if (Arrays.equals(ints, temp)){
                count++;
            }
        }

        return count;
    }


}
