package practice.leetcode.array.easy;

// Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_724 {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
        System.out.println(pivotIndex(new int[]{2,1,-1}));
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;

        for (int temp : nums){
            sum += temp;
        }

        int left = 0;

        for (int i = 0; i < nums.length; i++){
            left += nums[i];
            int right = sum - left + nums[i];

            if (right == left){
                return i;
            }
        }

        return -1;
    }

}
