package practice.leetcode.binary_search.easy;

// Longest Subsequence With Limited Sum
// https://leetcode.com/problems/longest-subsequence-with-limited-sum/description/

import java.util.Arrays;

public class Leetcode_2389 {

    public static void main(String[] args) {
        int[] ints = answerQueries(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21});

        for (int temp : ints){
            System.out.print(temp + " ");
        }
    }

    public static int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);

        int[] arr = new int[nums.length];

        int sum = 0;
        int i = 0;

        for (int temp : nums){
            sum += temp;
            arr[i++] = sum;
        }

        int[] res = new int[queries.length];
        int j = 0;

        for (int temp : queries){
            res[j++] = binary(arr,temp);
        }

        return res;
    }

    private static int binary (int[] arr, int target){
        int l = 0;
        int r = arr.length - 1;

        int index = -1;

        while (l <= r){
            int m = (l + r) / 2;

            if (arr[m] > target){
                r = m - 1;
            }else if (arr[m] < target){
                index = m;
                l = m + 1;
            }else {
                return m + 1;
            }

        }

        return index + 1;
    }

}
