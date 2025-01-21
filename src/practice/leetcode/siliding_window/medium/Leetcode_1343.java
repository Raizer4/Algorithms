package practice.leetcode.siliding_window.medium;

// Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
// https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/description/


public class Leetcode_1343 {

    public static void main(String[] args) {
        System.out.println(numOfSubarrays(new int[]{2,2,2,2,5,5,5,8}, 3, 4));
        System.out.println(numOfSubarrays(new int[]{11, 13, 17, 23, 29, 31, 7, 5, 2, 3}, 3, 5));
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int res = 0;
        int sum = 0;

        for (int i = 0; i < k; i++){
            sum += arr[i];
        }

        if (sum / k > threshold){
            res++;
        }

        for (int r = k; r < arr.length; r++) {
            sum -= arr[r - k];
            sum += arr[r];

            if (sum / k >= threshold){
                res++;
            }

        }


        return res;
    }

}
