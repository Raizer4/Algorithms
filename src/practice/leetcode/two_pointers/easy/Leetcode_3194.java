package practice.leetcode.two_pointers.easy;

// Minimum Average of Smallest and Largest Elements
// https://leetcode.com/problems/minimum-average-of-smallest-and-largest-elements/description/

import java.util.Arrays;


public class Leetcode_3194 {

    public static void main(String[] args) {
        System.out.println(minimumAverage(new int[]{7,8,3,4,15,13,4,1}));
    }

    public static double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;

        double minAvg = nums[j];

        while (i < j){
            double avg = (nums[i] + nums[j]) / 2.0;

            if (avg < minAvg){
                minAvg = avg;
            }

            j--;
            i++;
        }

        return minAvg;
    }

}
