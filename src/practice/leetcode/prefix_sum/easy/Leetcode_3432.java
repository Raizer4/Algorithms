package practice.leetcode.prefix_sum.easy;

// Count Partitions with Even Sum Difference
// https://leetcode.com/problems/count-partitions-with-even-sum-difference/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_3432 {

    public static void main(String[] args) {
        System.out.println(countPartitions(new int[]{10,10,3,7,6}));
    }

    public static int countPartitions(int[] nums) {
        List<Integer> list = new ArrayList<>();

        int num = 0;

        for (int temp : nums){
            num += temp;
            list.add(num);
        }

        int res = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            Integer integer = list.get(nums.length - 1);

            if (((integer - list.get(i)) - list.get(i)) % 2 == 0){
                res++;
            }

        }


        return res;
    }


}
