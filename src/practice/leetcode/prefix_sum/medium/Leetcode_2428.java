package practice.leetcode.prefix_sum.medium;

// Maximum Sum of an Hourglass
// https://leetcode.com/problems/maximum-sum-of-an-hourglass/description/

public class Leetcode_2428 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{6,2,1,3},
                {4,2,1,5},
                {9,2,8,7},
                {4,1,2,9}};
        System.out.println( maxSum(arr));
    }

    public static int maxSum(int[][] grid) {
        int[][] mac = new int[grid.length][grid[0].length];

        for (int i = 0; i < grid.length; i++) {
            int temp = 0;
            for (int j = 0; j < grid[0].length; j++) {
                temp += grid[i][j];
                mac[i][j] = temp;
            }
        }

        int max = 0;

        for (int i = 0; i < grid.length; i++) {
            if (i + 2 >= grid.length){break;}
            for (int j = 0; j < grid[0].length; j++) {
                if (j + 2 >= grid[0].length){break;}

                int temp = 0;

                if (j == 0){
                    temp = mac[i][j + 2] + grid[i + 1][j + 1] +  mac[i + 2][j + 2];
                }else {
                    temp = (mac[i][j + 2] - mac[i][j - 1]) +  grid[i + 1][j + 1] + (mac[i + 2][j + 2] - mac[i + 2][j - 1]);
                }

                max = Math.max(max,temp);
            }
        }

        return max;
    }

}
