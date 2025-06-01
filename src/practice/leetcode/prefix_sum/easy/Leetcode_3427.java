package practice.leetcode.prefix_sum.easy;

// Sum of Variable Length Subarrays
// https://leetcode.com/problems/sum-of-variable-length-subarrays/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_3427 {

    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{3,1,1,2}));
    }

    public static int subarraySum(int[] nums) {
        int sum = 0;

        List<Integer> list = new ArrayList<>();

        for (int temp : nums){
            sum += temp;
            list.add(sum);
        }

        int res = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = i - nums[i];

            if (temp <= 0){
                res += list.get(i);
            }else {
                res += (list.get(i) - list.get(temp)) + nums[temp];
            }
        }

        return res;
    }

}
