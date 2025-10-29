package practice.leetcode.prefix_sum.medium;

// Maximum Side Length of a Square with Sum Less than or Equal to Threshold
// https://leetcode.com/problems/maximum-side-length-of-a-square-with-sum-less-than-or-equal-to-threshold/description/

public class Leetcode_1292 {

    public static void main(String[] args) {
        System.out.println(maxSideLength(new int[][]{{1,1,1,1}, {1,0,0,0}, {1,0,0,0}, {1,0,0,0}}, 6));
    }

    public static int maxSideLength(int[][] mat, int threshold) {
        int m = mat.length;
        int n = mat[0].length;

        int[][] prefix = new int[mat.length][mat[0].length];

        prefix[0][0] = mat[0][0];

        for (int i = 1; i < mat[0].length; i++) {
            prefix[0][i] = prefix[0][i - 1] + mat[0][i];
        }

        for (int i = 1; i < mat.length; i++) {
            prefix[i][0] = prefix[i - 1][0] + mat[i][0];
        }

        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; j < mat[0].length; j++) {
                int num = (mat[i][j] + prefix[i - 1][j] + prefix[i][j - 1]) - prefix[i - 1][j - 1];
                prefix[i][j] = num;
            }
        }

        int temp = 0;

        int answer = 0;

        while (temp <= Math.min(n - 1, m - 1)) {
            int num = prefix[temp][temp];

            if (num > threshold){
                break;
            }
            answer = Math.max(temp + 1, answer);
            temp++;
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == 0 && j == 0){
                    continue;
                }
                int num = i;
                int fd = j;

                while (num <= (m - 1) && fd <= (n - 1)){
                    int ints;

                    ints = prefix[num][fd];
                    if (i > 0) ints -= prefix[i - 1][fd];
                    if (j > 0) ints -= prefix[num][j - 1];
                    if (i > 0 && j > 0) ints += prefix[i - 1][j - 1];

                    if (ints > threshold){
                        break;
                    }

                    answer = Math.max((num - i) + 1, answer);
                    num++;
                    fd++;
                }

            }
        }

        return answer;
    }

}
