package practice.leetcode.greedy.medium;

// Gas Station
// https://leetcode.com/problems/gas-station/description/

import java.util.Arrays;

public class Leetcode_134 {

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        if (Arrays.stream(gas).sum() < Arrays.stream(cost).sum()){
            return -1;
        }

        int total = 0;
        int res = 0;

        for (int i = 0; i < gas.length; i++) {
            total += (gas[i] - cost[i]);

            if (total < 0){
                total = 0;
                res = i + 1;
            }

        }

        return res;
    }




}
