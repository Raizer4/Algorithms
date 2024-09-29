package practice.leetcode.leetcode_75;

// Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_724 {

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1,7,3,6,5,6}));
        System.out.println(pivotIndex(new int[]{1,2,3}));
        System.out.println(pivotIndex(new int[]{2,1,-1}));
    }

    public static int pivotIndex(int[] nums) {
        int count = 0;
        for (int temp : nums){
            count += temp;
        }
        int sum = 0;

        for (int i = 0; i < nums.length; i++){

            if (sum == count - sum - nums[i]){
                return i;
            }

            sum += nums[i];
        }

        return -1;
    }

}
