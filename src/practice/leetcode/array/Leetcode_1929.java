package practice.leetcode.array;

// Concatenation of Array
// https://leetcode.com/problems/concatenation-of-array/description/

public class Leetcode_1929 {

    public static void main(String[] args) {
        int[] concatenation = getConcatenation(new int[]{1, 2, 1});
        for (int temp : concatenation){
            System.out.println(temp);
        }
    }

    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length * 2];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (j == nums.length) {
                j = 0;
            }
            arr[i] = nums[j];
            j++;
        }
        return arr;
    }

}
