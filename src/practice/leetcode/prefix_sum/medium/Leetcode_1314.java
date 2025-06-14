package practice.leetcode.prefix_sum.medium;

// Matrix Block Sum
// https://leetcode.com/problems/matrix-block-sum/description/

public class Leetcode_1314 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] ints = matrixBlockSum(arr, 1);

        for (int[] temp : ints){
            for (int d : temp){
                System.out.print(d + " ");
            }
            System.out.println();
        }

    }

    public static int[][] matrixBlockSum(int[][] mat, int k) {
        int[][] dublicate = new int[mat.length][mat[0].length];

        for (int j = 0; j < mat.length; j++){
            int temp = 0;

            for (int i = 0; i < mat[j].length; i++){
                temp += mat[j][i];
                dublicate[j][i] = temp;
            }
        }

        int[][] arr = new int[mat.length][mat[0].length];

        for (int i = 0; i < mat.length; i++) {
            int start_i = i - k > 0 ? i - k : 0;
            int end_i = i + k < mat.length ? i + k : mat.length - 1;

            int neg = start_i;

            for (int j = 0; j < mat[i].length; j++) {
                int start_j = j - k > 0 ? j - k : 0;
                int end_j = j + k < mat[i].length ? j + k : mat[i].length - 1;

                int temp = 0;

                for (int l = start_i; l <= end_i; l++) {

                    if (start_j != 0){
                        temp += dublicate[start_i][end_j] - dublicate[start_i][start_j - 1];
                    }else {
                        temp += dublicate[start_i][end_j];
                    }

                    start_i++;
                }

                start_i = neg;

                arr[i][j] = temp;
            }
        }

        return arr;
    }

}
