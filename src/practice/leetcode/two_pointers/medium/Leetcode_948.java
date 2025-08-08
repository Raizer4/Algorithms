package practice.leetcode.two_pointers.medium;

// Bag of Tokens
// https://leetcode.com/problems/bag-of-tokens/description/

import java.util.Arrays;

public class Leetcode_948 {

    public static void main(String[] args) {
        System.out.println(bagOfTokensScore(new int[]{71,55,82}, 54));
    }

    public static int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);

        int l = 0;
        int r = tokens.length - 1;

        int max = 0;
        int score = 0;

        while (l <= r){
            if (tokens[l] <= power){
                score++;
                power -= tokens[l];
                l++;
            }else {
                if (score < 1){
                    break;
                }
                score--;
                power += tokens[r];
                r--;
            }
            max = Math.max(max, score);
        }

        return max;
    }

}
