package practice.leetcode.greedy.medium;

// Maximum Matrix Sum
// https://leetcode.com/problems/maximum-matrix-sum/description/?envType=daily-question&envId=2026-01-05

public class Leetcode_1975 {

    public static void main(String[] args) {
        System.out.println(maxMatrixSum(new int[][]{
                {2,9,3},
                {5,4,-4},
                {1,7,1}
        }));
    }

    public static long maxMatrixSum(int[][] matrix) {
        int min = Integer.MIN_VALUE;

        long count = 0;
        long answer = 0;

        for (int[] arr : matrix){
            for (int temp : arr){
                if (temp <= 0){
                    count++;
                }
                int num = temp;

                if (num > 0){
                    num = -temp;
                }

                if (min < num){
                    min = num;
                }
                answer += Math.abs(temp);
            }
        }

        if (count % 2 == 1){
            answer += min;
            answer += min;
        }

        return answer;
    }

}
