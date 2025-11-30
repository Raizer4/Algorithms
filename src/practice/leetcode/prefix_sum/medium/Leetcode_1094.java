package practice.leetcode.prefix_sum.medium;

// Car Pooling
// https://leetcode.com/problems/car-pooling/description/

import java.util.Arrays;

public class Leetcode_1094 {

    public static void main(String[] args) {
        System.out.println(carPooling(new int[][]{{9,0,1}, {3,3,7}}, 4));
    }

    public static boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips, (a, b) -> Integer.compare(a[2], b[2]));
        int[] prefix = new int[trips[trips.length - 1][2] + 2];

        for(int[] arr : trips){
            prefix[arr[1]] += arr[0];
            prefix[arr[2]] -= arr[0];
        }


        for (int i = 0; i < prefix.length - 1; i++) {
            if (i == 0){
                if (prefix[i] > capacity){
                    return false;
                }
                continue;
            }
            prefix[i] = prefix[i - 1] + prefix[i];

            if (prefix[i] > capacity){
                return false;
            }
        }

        return true;
    }

}
