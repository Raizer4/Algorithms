package practice.leetcode.bit_manipulation.easy;

// Reverse Bits
// https://leetcode.com/problems/reverse-bits/description/

public class Leetcode_190 {

    public static void main(String[] args) {
        System.out.println(reverseBits(5));
    }

    public static int reverseBits(int n) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 32; i++) {
            if ( ((1 << i) & n) != 0){
                builder.append('1');
            }else {
                builder.append('0');
            }
        }

        int res = 0;
        String s = builder.reverse().toString();

        for (int i = 0; i < 32; i++) {
            if (s.charAt(i) == '1'){
                res |= (1 << i);
            }
        }

        return res;
    }

}
