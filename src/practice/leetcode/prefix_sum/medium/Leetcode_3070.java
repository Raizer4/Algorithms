package practice.leetcode.prefix_sum.medium;

// Count Submatrices with Top-Left Element and Sum Less Than k
// https://leetcode.com/problems/count-submatrices-with-top-left-element-and-sum-less-than-k/description/

public class Leetcode_3070 {

    public static void main(String[] args) {
        System.out.println(countSubmatrices(new int[][]{{7,6,3}, {6,6,1}}, 18));
    }

    public static int countSubmatrices(int[][] grid, int k) {
        int[][] prefix = new int[grid.length][grid[0].length];

        prefix[0][0] = grid[0][0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i][0] = prefix[i - 1][0] + grid[i][0];
        }

        for (int i = 1; i < prefix[0].length; i++) {
            prefix[0][i] = grid[0][i] + prefix[0][i - 1];
        }


        for (int i = 1; i < prefix.length; i++) {
            for (int j = 1; j < prefix[0].length; j++) {
                int num = ((grid[i][j] + (prefix[i][j - 1] + prefix[i - 1][j])) - prefix[i - 1][j - 1]);
                prefix[i][j] = num;
            }
        }

        int answer = 0;

        for (int[] arr : prefix){
            int binary = binary(arr, k);

            if (binary == -1){
                break;
            }

            answer += (binary + 1);
        }

        return answer;
    }

    private static int binary(int[] arr, int num){
        int l = 0;
        int r = arr.length - 1;

        int answer = -1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (arr[m] <= num){
                answer = m;
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        return answer;
    }

}
