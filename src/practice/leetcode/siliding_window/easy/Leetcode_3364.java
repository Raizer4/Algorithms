package practice.leetcode.siliding_window.easy;

// Minimum Positive Sum Subarray
// https://leetcode.com/problems/minimum-positive-sum-subarray/description/

import java.util.Arrays;
import java.util.List;

public class Leetcode_3364 {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, -2, 1, 4);
        System.out.println(minimumSumSubarray(list, 2, 3));
    }

    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();
        int minSum = Integer.MAX_VALUE;

        for (int size = l; size <= r; size++){
            int currentSum = 0;

            for (int i = 0; i < size; i++){
                currentSum += nums.get(i);
            }

            if (currentSum > 0){
                minSum = Math.min(minSum,currentSum);
            }

            for (int i = size; i < n; i++){
                currentSum += nums.get(i);
                currentSum -= nums.get(i - size);


                if (currentSum > 0){
                    minSum = Math.min(minSum,currentSum);
                }
            }
        }

        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }

}
