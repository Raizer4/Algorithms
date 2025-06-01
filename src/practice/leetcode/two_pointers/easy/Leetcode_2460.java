package practice.leetcode.two_pointers.easy;

// Apply Operations to an Array
// https://leetcode.com/problems/apply-operations-to-an-array/description/

public class Leetcode_2460 {

    public static void main(String[] args) {
        int[] ints = applyOperations(new int[]{0,1});

        for (int temp : ints){
            System.out.println(temp);
        }

    }

    public static int[] applyOperations(int[] nums) {
        int i = 0;
        int j = 1;

        int[] arr = new int[nums.length];
        int k = 0;

        while (j <= nums.length){
           if (j < nums.length && nums[i] == nums[j]){
               nums[i] = nums[i] * 2;
               nums[j] = 0;
           }

           if (nums[i] > 0){
               arr[k++] = nums[i];
           }

           i++;
           j++;
        }

        return arr;
    }

}
