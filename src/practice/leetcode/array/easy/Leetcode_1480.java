package practice.leetcode.array.easy;

// Running Sum of 1d Array
// https://leetcode.com/problems/running-sum-of-1d-array/description/

public class Leetcode_1480 {

    public static void main(String[] args) {
        int[] ints = runningSum(new int[]{1, 2, 3, 4});
        for (int temp : ints){
            System.out.print(temp + " ");
        }
    }

    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            arr[i] = sum;
        }

        return arr;
    }

}
