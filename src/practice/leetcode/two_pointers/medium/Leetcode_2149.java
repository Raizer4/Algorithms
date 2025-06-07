package practice.leetcode.two_pointers.medium;

// Rearrange Array Elements by Sign
// https://leetcode.com/problems/rearrange-array-elements-by-sign/description/

public class Leetcode_2149 {

    public static void main(String[] args) {
        int[] ints = rearrangeArray(new int[]{3,1,-2,-5,2,-4});

        for (int temp : ints){
            System.out.print(temp + " ");
        }
    }

    public static int[] rearrangeArray(int[] nums) {
        int p = 0;
        int n = 1;
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                temp[p] = nums[i];
                p = p + 2;
            }else {
                temp[n] = nums[i];
                n = n + 2;
            }
        }

        return temp;
    }
}
