package practice.leetcode.two_pointers.medium;

// The k Strongest Values in an Array
// https://leetcode.com/problems/the-k-strongest-values-in-an-array/description/

import java.util.Arrays;

public class Leetcode_1471 {

    public static void main(String[] args) {
        System.out.println(getStrongest(new int[]{1,2,3,4,5}, 2));
    }

    public static int[] getStrongest(int[] arr, int k) {
        Arrays.sort(arr);
        int m = (arr.length - 1) / 2;

        int l = 0;
        int r = arr.length - 1;

        int[] answer = new int[k];
        int i = 0;

        while (l < r && i < k){
            if (Math.abs(arr[r] - arr[m]) >= Math.abs(arr[l] - arr[m])){
                answer[i++] = arr[r];
                r--;
            }else {
                answer[i++] = arr[l];
                l++;
            }
        }

        return answer;
    }

}
