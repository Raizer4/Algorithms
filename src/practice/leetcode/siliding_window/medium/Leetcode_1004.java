package practice.leetcode.siliding_window.medium;

// Max Consecutive Ones III
// https://leetcode.com/problems/max-consecutive-ones-iii/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1004 {

    public static void main(String[] args) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
        System.out.println(longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,0,0,1,1,1,1},3));
    }

    public static int longestOnes(int[] nums, int k) {
        int l = 0;

        int zero = 0;
        int max = 0;

        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0){
                zero++;
            }

            while (zero > k){
                if (nums[l] == 0){
                    zero--;
                }
                l++;
            }

            max = Math.max(max,r - l + 1);
        }

        return max;
    }

}
