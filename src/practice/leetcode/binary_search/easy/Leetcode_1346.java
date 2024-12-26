package practice.leetcode.binary_search.easy;

// Check If N and Its Double Exist
// https://leetcode.com/problems/check-if-n-and-its-double-exist/description/

import java.util.Arrays;

public class Leetcode_1346 {

    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{-2,0,10,-19,4,6,-8}));
    }

    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        int zero = 0;

        for (int temp : arr){
            if (temp == 0){
                zero++;
                continue;
            }
            if (binary(arr,temp * 2)){
                return true;
            }
        }

        return zero > 1;
    }

    private static boolean binary(int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;

        while (l <= r){
            int m = (l + r) / 2;

            if (arr[m] > target){
                r = m - 1;
            }else if (arr[m] < target){
                l = m + 1;
            }else {
                return true;
            }
        }

        return false;
    }

}
