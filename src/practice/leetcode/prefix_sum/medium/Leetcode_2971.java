package practice.leetcode.prefix_sum.medium;

// Find Polygon With the Largest Perimeter
// https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/description/

import java.util.Arrays;

public class Leetcode_2971 {

    public static void main(String[] args) {
        System.out.println(largestPerimeter(new int[]{1,12,1,2,5,50,3}));
    }

    public static long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long[] prefix = new long[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] + nums[i];
        }

        long answer = -1;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (prefix[i] > nums[i]){
                if (i + 1 >= 3){
                    answer = prefix[i + 1];
                }
                break;
            }
        }

        return answer;
    }


}


