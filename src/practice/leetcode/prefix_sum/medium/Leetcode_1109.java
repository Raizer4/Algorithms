package practice.leetcode.prefix_sum.medium;

// Corporate Flight Bookings
// https://leetcode.com/problems/corporate-flight-bookings/description/

public class Leetcode_1109 {

    public static void main(String[] args) {
        int[] ints = corpFlightBookings(new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}}, 5);

        for (int temp:ints){
            System.out.print(temp + " ");
        }
    }

    public static int[] corpFlightBookings(int[][] bookings, int n) {
        int[] arr = new int[n + 1];

        for (int[] temp : bookings){
            arr[temp[0]]+=temp[2];
            if (temp[1] + 1 <= n){
                arr[temp[1] + 1]-=temp[2];
            }
        }

        int[] result = new int[n];

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i - 1] + arr[i];
            result[i - 1] = temp;
            arr[i] = temp;
        }

        return result;
    }

}
