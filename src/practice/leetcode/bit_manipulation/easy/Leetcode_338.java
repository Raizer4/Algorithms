package practice.leetcode.bit_manipulation.easy;

// Counting Bits
// https://leetcode.com/problems/counting-bits/description/

public class Leetcode_338 {

    public static void main(String[] args) {
        int[] ints = countBits(5);

        for (int temp : ints){
            System.out.print(temp + " ");
        }

    }

    public static int[] countBits(int n) {
        int[] arr = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int res = 0;

            for (int j = 0; j < 32; j++) {
                if ( ((1 << j) & i) != 0){
                    res++;
                }
            }

            arr[i] = res;
        }

        return arr;
    }

}
