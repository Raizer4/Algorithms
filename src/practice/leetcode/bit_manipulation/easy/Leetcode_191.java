package practice.leetcode.bit_manipulation.easy;

// Number of 1 Bits
// https://leetcode.com/problems/number-of-1-bits/description/

public class Leetcode_191 {

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }

    public static int hammingWeight(int n) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            if (((1 << i) & n) != 0){
                res++;
            }
        }
        
        return res;
    }

}
