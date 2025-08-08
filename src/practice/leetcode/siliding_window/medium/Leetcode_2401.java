package practice.leetcode.siliding_window.medium;

// Longest Nice Subarray
// https://leetcode.com/problems/longest-nice-subarray/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2401 {

    public static void main(String[] args) {
        System.out.println(longestNiceSubarray(new int[]{2,4,8,2,8,16,32}));
    }

    public static int longestNiceSubarray(int[] nums) {
        int answer = 1;
        int l = 0;

        List<Integer> set = new ArrayList<>();
        set.add(nums[0]);

        for (int i = 1; i < nums.length; i++) {
            boolean flag = cheking(nums,set,nums[i]);

            if (flag){
                answer = Math.max(answer, (i - l + 1));
            }else {
                while (!flag && !set.isEmpty()){
                    set.remove(0);
                    flag = cheking(nums, set, nums[i]);
                    l++;
                }
            }

            set.add(nums[i]);
        }

        return answer;
    }

    private static boolean cheking(int[] nums, List<Integer> set, int num){
        for (Integer temp : set){
            if ((temp & num) != 0){
                return false;
            }
        }

        return true;
    }


}
