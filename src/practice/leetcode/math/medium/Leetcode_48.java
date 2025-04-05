package practice.leetcode.math.medium;

// Rotate Image
// https://leetcode.com/problems/rotate-image/description/

public class Leetcode_48 {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3},{4,5,6},{7,8,9}};

        rotate(matrix);

        for (int[] arr : matrix){
            for (int temp : arr){
                System.out.print(temp + " ");
            }
            System.out.println();
        }
    }

    public static void rotate(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix[0].length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                arr[j][(matrix.length - 1) - i] = matrix[i][j];
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = arr[i][j];
            }
        }

    }

}
