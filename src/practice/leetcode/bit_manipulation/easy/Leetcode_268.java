package practice.leetcode.bit_manipulation.easy;

// Missing Number
// https://leetcode.com/problems/missing-number/description/

public class Leetcode_268 {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int xorr = n;

        for (int i = 0; i < n; i++) {
            int i1 = i ^ nums[i];

            xorr ^= i1;
        }
        
        return xorr;
    }

}
