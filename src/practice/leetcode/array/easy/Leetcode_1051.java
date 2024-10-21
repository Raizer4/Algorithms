package practice.leetcode.array.easy;

// Height Checker
// https://leetcode.com/problems/height-checker/description/

import java.util.Arrays;

public class Leetcode_1051 {

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,1,4,2,1,3}));
    }

    public static int heightChecker(int[] heights) {
        int[] res = new int[heights.length];

        for (int i = 0; i < heights.length; i++){
            res[i] = heights[i];
        }

        Arrays.sort(res);

        int count = 0;

        for (int i = 0; i < heights.length; i++){
            if (res[i] != heights[i]){
                count++;
            }
        }

        return count;
    }

}
