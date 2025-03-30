package practice.leetcode.bit_manipulation.medium;

// Minimum Flips to Make a OR b Equal to c
// https://leetcode.com/problems/minimum-flips-to-make-a-or-b-equal-to-c/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1318 {

    public static void main(String[] args) {
        System.out.println(minFlips(2,6,5));
    }

    public static int minFlips(int a, int b, int c) {
        int flips = 0;

        for (int i = 0; i < 32; i++) {
            int bitA = (a >> i) & 1;
            int bitB = (b >> i) & 1;
            int bitC = (c >> i) & 1;

            if ((bitA | bitB) != bitC){
                if (bitC == 1){
                    flips += 1;
                }else {
                    flips += (bitA + bitB);
                }
            }
        }

        return flips;
    }

}
