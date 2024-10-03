package practice.leetcode;

// Count Number of Pairs With Absolute Difference K
// https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/description/

public class Leetcode_2006 {

    public static void main(String[] args) {
        System.out.println(countKDifference(new int[]{1,2,2,1},1));
    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(temp - nums[j]) == k){
                    count++;
                }
            }
        }

        return count;
    }

}
