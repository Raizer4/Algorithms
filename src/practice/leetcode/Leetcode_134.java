package practice.leetcode;

// Gas Station
// https://leetcode.com/problems/gas-station/description/

import java.util.Arrays;

public class Leetcode_134 {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int negative = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < gas.length; i++) {
            int temp = gas[i] - cost[i];
            sum += temp;
            if (negative > sum){
                negative = sum;
                index = i;
            }
        }

        sum = 0;

        for (int i = (index + 1) % gas.length; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0){
                return -1;
            }
        }

        for (int i = 0; i < (index + 1) % gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < 0){
                return -1;
            }
        }

        return (index + 1) % gas.length;
    }




}
