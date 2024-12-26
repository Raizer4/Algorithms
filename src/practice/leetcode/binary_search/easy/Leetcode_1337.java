package practice.leetcode.binary_search.easy;

// The K Weakest Rows in a Matrix
// https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_1337 {

    public static void main(String[] args) {
        int[][] arr = new int[][]
                {{1, 1, 0, 0, 0},
                 {1, 1, 1, 1, 0},
                 {1, 0, 0, 0, 0},
                 {1, 1, 0, 0, 0},
                 {1, 1, 1, 1, 1}};


        int[] ints = kWeakestRows(arr, 3);

        for (int temp : ints){
            System.out.print(temp + " ");
        }

    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < mat.length; i++){
            int temp = countSoldiers(mat[i]);
            list.add(new int[]{temp, i});
        }

        Collections.sort(list, (a,b) -> {
            if (a[0] != b[0]){
                return a[0] - b[0];
            }
            return a[1] - b[1];
        });

        int[] res = new int[k];

        for (int i = 0; i < k; i++){
            res[i] = list.get(i)[1];
        }

        return res;
    }

    private static int countSoldiers(int[] arr){
        int l = 0;
        int r = arr.length - 1;

        int index = -1;

        while (l <= r){
            int m = (r + l) / 2;

            if (arr[m] == 1){
                index = m;
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        return index + 1;
    }

}
