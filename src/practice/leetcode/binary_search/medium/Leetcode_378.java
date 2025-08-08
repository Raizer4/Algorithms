package practice.leetcode.binary_search.medium;

// Kth Smallest Element in a Sorted Matrix
// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/

public class Leetcode_378 {

    public static void main(String[] args) {
        System.out.println(kthSmallest(new int[][]{
                {1,2},{1,3}
        }, 8));
    }

    public static int kthSmallest(int[][] matrix, int k) {
       int l = matrix[0][0];
       int r = matrix[matrix.length - 1][matrix.length - 1];

       int answer = l;

       while (l <= r){
           int m = l + (r - l) / 2;
           int temp = 0;

           for(int[] arr : matrix){
               temp += counting(arr, m);
           }

           if (temp >= k){
               answer = m;
               r = m - 1;
           }else {
               l = m + 1;
           }
       }

       return answer;
    }

    private static int counting(int[] arr, int threshold){
        int l = 0;
        int r = arr.length - 1;

        int total = 0;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (arr[m] > threshold){
                r = m - 1;
            }else {
                total = m + 1;
                l = m + 1;
            }
        }

        return total;
    }

}

