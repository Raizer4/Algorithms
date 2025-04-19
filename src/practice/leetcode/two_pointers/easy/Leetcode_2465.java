package practice.leetcode.two_pointers.easy;

// Number of Distinct Averages
// https://leetcode.com/problems/number-of-distinct-averages/description/

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode_2465 {

    public static void main(String[] args) {
        System.out.println(distinctAverages(new int[]{9,5,7,8,7,9,8,2,0,7}));
    }

    public static int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        int l = 0;
        int r = nums.length - 1;

        Set<Double> set = new HashSet<>();

        while (l <= r){
            double v = (nums[l] + nums[r]) / 2.0;
            set.add(v);
            l++;
            r--;
        }

        return set.size();
    }

}
