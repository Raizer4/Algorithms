package practice.leetcode.binary_search.easy;

// Kth Missing Positive Number
// https://leetcode.com/problems/kth-missing-positive-number/description/

public class Leetcode_1539 {

    public static void main(String[] args) {
        System.out.println(findKthPositive(new int[]{5,6,7,8,9}, 9));
    }

    public static int findKthPositive(int[] arr, int k) {
        int l = 0;
        int r = arr.length - 1;

        while (l <= r){
            int m = (r + l) / 2;

            if (arr[m] - (m + 1) >= k){
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return l + k;
    }

}
