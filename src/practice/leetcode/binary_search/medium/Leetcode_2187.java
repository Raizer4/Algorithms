package practice.leetcode.binary_search.medium;

// Minimum Time to Complete Trips
// https://leetcode.com/problems/minimum-time-to-complete-trips/description/

public class Leetcode_2187 {

    public static void main(String[] args) {
        System.out.println(minimumTime(new int[]{2}, 1));
    }

    public static long minimumTime(int[] time, int totalTrips) {
        int min = time[0];
        for (int temp :time){min = Math.min(temp, min);}

        long l = 0;
        long r = ((long) min * totalTrips);

        long answer = 0;

        while (l <= r){
            long m = (l + (r - l) / 2);

            int total = 0;

            for (int temp : time){
                total += m / temp;
            }

            if (total >= totalTrips){
                answer = m;
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return answer;
    }

}
