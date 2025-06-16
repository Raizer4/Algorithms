package practice.leetcode.binary_search.medium;

// Peak Index in a Mountain Array
// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

public class Leetcode_852 {

    public static void main(String[] args) {
        System.out.println(peakIndexInMountainArray(new int[]{1,57,58,74,88,93,98,97,96,91,90,78,77,74,71,68,61,50,42,38,35,34,26,20,15,14,5,4,2}));
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int r = arr.length - 1;

        int res = l + (r - l) / 2;
        int max = arr[res];

        while (l < r){
            int m = l + (r - l) / 2;

            if (arr[m] > max){
                res = m;
                max = arr[m];
            }

            if (arr[m] < arr[m + 1]){
                if (arr[m + 1] > max){
                    max = arr[m + 1];
                    res = m + 1;
                }
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        return res;
    }

}
