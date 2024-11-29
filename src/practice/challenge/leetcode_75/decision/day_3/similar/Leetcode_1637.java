package practice.challenge.leetcode_75.decision.day_3.similar;

// Widest Vertical Area Between Two Points Containing No Points
// https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/description/

import java.util.Arrays;

public class Leetcode_1637 {

    public static void main(String[] args) {
        System.out.println(maxWidthOfVerticalArea(new int[][]{{1,5},{1,70},{3,1000},{55,700},{999876789,53},{987853567,12}}));
    }

    public static int maxWidthOfVerticalArea(int[][] points) {
        Integer max = 0;

        Arrays.sort(points,(a,b) -> Integer.compare(a[0],b[0]));

        Integer first = null;
        Integer two = null;

        for (int[] arr : points) {

            if (first == null) {
                first = arr[0];
                continue;
            }else if (two == null ){
                two = arr[0];
            }else {
                first = two;
                two = arr[0];
            }

            int abs = Math.abs(first - two);

            if (max < abs){
                max = abs;
            }

        }

        return max;
    }

}
