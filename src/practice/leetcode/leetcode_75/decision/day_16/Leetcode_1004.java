package practice.leetcode.leetcode_75.decision.day_16;

// Max Consecutive Ones III
// https://leetcode.com/problems/max-consecutive-ones-iii/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1004 {

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,0,0,1,1,1,1},3));
    }

    public static int longestOnes(int[] nums, int k) {
        int zero = 0;
        int j = 0;
        int size = 0;


        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zero++;
            }

            while (zero > k) {
                if (nums[j] == 0) {
                    zero--;
                }

                j++;
            }

            size = Math.max(size, i-j+1);

        }
        return size;
    }

}
