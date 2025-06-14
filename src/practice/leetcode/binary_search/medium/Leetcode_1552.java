package practice.leetcode.binary_search.medium;

// Magnetic Force Between Two Balls
// https://leetcode.com/problems/magnetic-force-between-two-balls/description/

import java.util.Arrays;

public class Leetcode_1552 {

    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{1,2,3,4,7}, 3));
    }

    public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int left = 0;
        int right = position[position.length - 1] - position[0];
        int result = 0;

        while (left <= right){
            int mid = left + (right - left) / 2;

            if (canPlaceBalls(position, m, mid)){
                result = mid;
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }

        return result;
    }

    private static boolean canPlaceBalls(int[] position, int m, int minForce){
        int count = 1;
        int lastPos = position[0];

        for (int i = 1; i < position.length; i++) {
            if (position[i] - lastPos >= minForce){
                count++;
                lastPos = position[i];
                if (count >= m){
                    return true;
                }
            }
        }

        return false;
    }

}
