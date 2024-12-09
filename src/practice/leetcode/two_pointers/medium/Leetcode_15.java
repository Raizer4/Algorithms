package practice.leetcode.two_pointers.medium;

// 3Sum
// https://leetcode.com/problems/3sum/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_15 {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);


        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) break;

            if (i > 0 && nums[i - 1] == nums[i]){
               continue;
            }

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[r] + nums[l];

                if (sum > 0) {
                    r--;
                } else if (sum < 0){
                    l++;
                }else {
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }

        return list;
    }

}
