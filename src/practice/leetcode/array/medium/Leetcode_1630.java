package practice.leetcode.array.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_1630 {

    public static void main(String[] args) {
        System.out.println(checkArithmeticSubarrays(new int[]{4,6,5,9,3,7}, new int[]{0,0,2}, new int[]{2,3,5}));
    }

    public static List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> booleans = new ArrayList<>();

        for (int i = 0; i < l.length; i++){
           booleans.add(tempMethod (Arrays.copyOfRange(nums, l[i], r[i] + 1)));
        }

        return booleans;
    }

    private static boolean tempMethod(int[] nums) {
        Arrays.sort(nums);
        int diff = nums[1] - nums[0];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] != diff) {
                return false;
            }
        }
        return true;
    }


}
