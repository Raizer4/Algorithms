package practice.leetcode.siliding_window.easy;

// Minimum Recolors to Get K Consecutive Black Blocks
// https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/description/

public class Leetcode_2379 {

    public static void main(String[] args) {
        System.out.println(minimumRecolors("WBBWWBBWBW",7));
        System.out.println(minimumRecolors("WBWBBBW",2));
    }

    public static int minimumRecolors(String blocks, int k) {
        int l = 0;
        int white = 0;
        int max = Integer.MAX_VALUE;

        for (int r = 0; r < blocks.length(); r++) {
            if (blocks.charAt(r) == 'W'){
                white++;
            }

            if (r - l + 1 == k){
                max = Math.min(max,white);


                if (blocks.charAt(l) == 'W'){
                    white--;
                }
                l++;
            }

        }

        return max;
    }



}
