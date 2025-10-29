package practice.leetcode.binary_search.medium;

// The Latest Time to Catch a Bus
// https://leetcode.com/problems/the-latest-time-to-catch-a-bus/description/?__cf_chl_tk=9.4pojQMoS1gbCnRoQLNkaDRnOAU7oQGevLMfboYIZM-1755945933-1.0.1.1-b6JvVU5XxyBE5Yx1QzvH3UYWP1BMWcINXbT5koCxPAQ

import java.util.Arrays;

public class Leetcode_2332 {

    public static void main(String[] args) {
        System.out.println(latestTimeCatchTheBus(new int[]{20, 10}, new int[]{19, 17, 2, 18}, 2));
        System.out.println(latestTimeCatchTheBus(new int[]{20, 30, 10}, new int[]{19, 13, 26, 4, 25, 11, 21}, 2));
        System.out.println(latestTimeCatchTheBus(new int[]{2, 3}, new int[]{2, 3}, 2));
        System.out.println(latestTimeCatchTheBus(new int[]{3}, new int[]{2}, 1));
        System.out.println(latestTimeCatchTheBus(new int[]{2, 3}, new int[]{4, 2}, 1));
        System.out.println(latestTimeCatchTheBus(new int[]{5}, new int[]{7, 8}, 1));
        System.out.println(latestTimeCatchTheBus(new int[]{6,8,18,17}, new int[]{6,8,17}, 1));
    }

    public static int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);

        int l = 0;
        boolean tem = false;

        for (int i = 0; i < buses.length; i++) {
            boolean flag = false;

            int temp = l + capacity >= passengers.length ? passengers.length - 1 : (l + capacity - 1);
            int next = binary(l, temp, buses[i], passengers);

            if (next == -1){
                tem = false;
                continue;
            }

            if (((next - l) + 1) == capacity){
                flag = true;
            }

            if (flag){
                if (i == buses.length - 1 || l == passengers.length - 1){
                    if (buses.length > passengers.length){
                        tem = false;
                    }else {
                        tem = true;
                    }
                    l = next;
                    break;
                }else {
                    l = next + 1;
                }
            }else {
                l = next + 1;
            }

            tem = flag;
        }

        if (!tem){
            for (int i = buses[buses.length - 1]; i >= 0; i--) {
                if (!checing(passengers, i)){
                    return i;
                }
            }
        }else {
            for (int i = passengers[l]; i >= 0; i--) {
                if (!checing(passengers, i)){
                    return i;
                }
            }
        }


        return -1;
    }

    private static int binary(int i, int j, int num, int[] passengers) {
        int l = i;
        int r = j;

        int index = -1;

        while (l <= r) {
            int m = l + (r - l) / 2;

            if (passengers[m] <= num) {
                index = m;
                l = m + 1;
            } else {
                r = m - 1;
            }

        }

        return index;
    }

    private static boolean checing(int[] passengers, int num){
        int l = 0;
        int r = passengers.length - 1;

        while (l <= r){
            int m = l + (r - l) / 2;

            if (passengers[m] == num){
                return true;
            } else if (passengers[m] > num) {
                r = m - 1;
            }else {
                l = m + 1;
            }

        }

        return false;
    }

}
