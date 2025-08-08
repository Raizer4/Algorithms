package practice.leetcode.binary_search.medium;

// Minimum Time to Repair Cars
// https://leetcode.com/problems/minimum-time-to-repair-cars/description/

import java.util.Arrays;

public class Leetcode_2594 {

    public static void main(String[] args) {
        System.out.println(repairCars(new int[]{3,3,2}, 52));
    }

    public static long repairCars(int[] ranks, int cars) {
        long left = 1;
        long right = (long) Arrays.stream(ranks).min().getAsInt() * cars * cars;
        long answer = right;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long total = 0;

            for (int r : ranks) {
                total += (long) Math.sqrt(mid / r);
            }

            if (total >= cars) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }


}
