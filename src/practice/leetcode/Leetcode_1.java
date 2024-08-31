package practice.leetcode;

// Two Sum
// https://leetcode.com/problems/two-sum/

public class Leetcode_1 {

    public static void main(String[] args) {
        int[] ints = twoSum(new int[]{6,5,3,15,7}, 11);
        if (ints.length == 0){
            System.out.println("Нет нужных данных");
        }else {
            for (int temp : ints){
                System.out.print(temp + " ");
            }
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int n = i + 1; n < nums.length; n++) {
                if (temp + nums[n] == target) {
                    return new int[]{i, n};
                }
            }
        }
        return new int[]{};
    }

}
