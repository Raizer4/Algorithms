package practice.leetcode.binary_search.medium;

// Search a 2D Matrix
// https://leetcode.com/problems/search-a-2d-matrix/description/

public class Leetcode_74 {

    public static void main(String[] args) {
        System.out.println(searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20}, {23,30,34,60}} ,3));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        for (int[] arr : matrix){
            if (arr[0] > target){
                return false;
            }else if (arr[arr.length - 1] < target){
                continue;
            }else {
                if (binary(arr, target)){
                    return true;
                }
            }
        }

        return false;
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
