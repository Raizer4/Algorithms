package practice.leetcode.leetcode_75.day_2;

// Move Zeroes
// https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_283 {

    public static void main(String[] args) {
        int[] ints = {0, 1, 0, 3, 12};

        moveZeroes(ints);

        for (int temp : ints){
            System.out.println(temp + " ");
        }


    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        while (j < nums.length) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            j++;
        }
    }

}
