package practice.leetcode;

// Sort Array By Parity
// https://leetcode.com/problems/sort-array-by-parity/description/

public class Leetcode_905 {

    public static void main(String[] args) {
        int[] ints = sortArrayByParity(new int[]{3, 1, 2, 4});

        for (Integer temp : ints){
            System.out.println(temp);
        }

    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                result[index++] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 1){
                result[index++] = nums[i];
            }
        }

        return result;
    }

}
