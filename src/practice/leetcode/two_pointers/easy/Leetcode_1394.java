package practice.leetcode.two_pointers.easy;

// Find Lucky Integer in an Array
// https://leetcode.com/problems/find-lucky-integer-in-an-array/description/?envType=daily-question&envId=2025-07-05

import java.util.Arrays;


public class Leetcode_1394 {

    public static void main(String[] args) {
        System.out.println(findLucky(new int[]{2,2,2,3,3}));
    }

    public static int findLucky(int[] arr) {
        Arrays.sort(arr);

        int l = 0;
        int r = 0;

        int answer = -1;
        int pred = -1;

        while (r < arr.length){
            if (arr[l] == arr[r]){
                int temp = ((r - l) + 1);
                if (arr[l] == temp){
                    answer = temp;
                } else if (temp > arr[l]) {
                    answer = pred;
                }
                r++;
            }else if (l < r){
                pred = answer;
                l++;
            }
        }

        return answer;
    }

}
