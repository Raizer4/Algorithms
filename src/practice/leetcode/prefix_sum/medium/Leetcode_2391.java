package practice.leetcode.prefix_sum.medium;

// Minimum Amount of Time to Collect Garbage
// https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/description/

public class Leetcode_2391 {

    public static void main(String[] args) {
        System.out.println(garbageCollection(
                new String[]{"G", "P", "GP", "GG"},
                new int[]{2,4,3})
        );
    }

    public static int garbageCollection(String[] garbage, int[] travel) {
        int totatl = 0;

        int m = -1;
        int g = -1;
        int p = -1;

        for (int i = 0; i < garbage.length; i++) {
            String str = garbage[i];
            totatl += str.length();

            if (i >= 1 && i < garbage.length - 1){
                travel[i] = travel[i] + travel[i - 1];
            }

            if (str.indexOf('G') != -1){
                g = i;
            }

            if (str.indexOf('P') != -1){
                p = i;
            }

            if (str.indexOf('M') != -1){
                m = i;
            }
        }

        if (m >= 1){
            totatl += travel[m - 1];
        }

        if (p >= 1){
            totatl += travel[p - 1];
        }

        if (g >= 1){
            totatl += travel[g - 1];
        }

        return totatl;
    }

}
