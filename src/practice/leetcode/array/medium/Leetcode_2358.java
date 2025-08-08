package practice.leetcode.array.medium;

// Maximum Number of Groups Entering a Competition
// https://leetcode.com/problems/maximum-number-of-groups-entering-a-competition/description/

import java.util.Arrays;

public class Leetcode_2358 {

    public static void main(String[] args) {
        System.out.println(maximumGroups(new int[]{10,6,12,7,3,5}));
    }

    public static int maximumGroups(int[] grades) {
        Arrays.sort(grades);
        int res = 0;
        long sumPrev = 0, sumCurr = 0;
        int countPrev = 0, countCurr = 0;

        for (int grade : grades) {
            sumCurr += grade;
            countCurr++;

            if (sumCurr > sumPrev && countCurr > countPrev) {
                sumPrev = sumCurr;
                countPrev = countCurr;
                sumCurr = 0;
                countCurr = 0;
                res++;
            }
        }

        return res;
    }

}
