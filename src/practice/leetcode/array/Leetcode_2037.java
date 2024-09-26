package practice.leetcode.array;

// Minimum Number of Moves to Seat Everyone
// https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/description/

import java.util.Arrays;

public class Leetcode_2037 {

    public static void main(String[] args) {
        System.out.println(minMovesToSeat(new int[]{4,1,5,9},new int[]{1,3,2,6}));
    }

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count = 0;

        for (int i = 0; i < seats.length; i++){
            count += Math.abs(seats[i] - students[i]);
        }

        return count;
    }

}
