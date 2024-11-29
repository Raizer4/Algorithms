package practice.challenge.leetcode_75.decision.day_10;

// Move Zeroes
// https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_283 {

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
        moveZeroes(new int[]{0});
        moveZeroes(new int[]{0,0,0});
    }

    public static void moveZeroes(int[] nums) {
        int i = 0;
        int j = 1;

        while (j < nums.length){
            if (nums[i] == 0 && nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }else if (nums[i] == 0 && nums[j] == 0){
                j++;

                while (j < nums.length && nums[j] == 0){
                    j++;
                }

                if (j >= nums.length){break;}

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j = i + 1;
            }else {
                i++;
                j++;
            }
        }

    }

}
