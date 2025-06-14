package practice.leetcode.prefix_sum.medium;

// Find the Score of All Prefixes of an Array
// https://leetcode.com/problems/find-the-score-of-all-prefixes-of-an-array/description/

public class Leetcode_2640 {

    public static void main(String[] args) {
        long[] prefixScore = findPrefixScore(new int[]{2, 3, 7, 5, 10});

        for (long temp : prefixScore){
            System.out.print(temp + " ");
        }
    }

    public static long[] findPrefixScore(int[] nums) {
        int[] max_arr = new int[nums.length];

        int max = -1;

        for (int i = 0; i < nums.length; i++){
            max = Integer.max(max,nums[i]);
            max_arr[i] = max;
        }

        long[] res = new long[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[i] = nums[i] + max_arr[i];
        }

        for (int i = 1; i < nums.length; i++){
            res[i] = res[i] + res[i - 1];
        }

        return res;
    }

}
