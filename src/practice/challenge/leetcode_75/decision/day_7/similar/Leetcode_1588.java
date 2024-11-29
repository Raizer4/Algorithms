package practice.challenge.leetcode_75.decision.day_7.similar;

// Sum of All Odd Length Subarrays
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/description/


public class Leetcode_1588 {

    public static void main(String[] args) {
        System.out.println(sumOddLengthSubarrays(new int[]{1,4,2,5,3}));
    }

    public static int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        int nechet = 1;
        int i = 0;

        while (arr.length >= nechet) {
            int tempSum = 0;
            int count = 0;

            while (i < arr.length) {
                count++;
                tempSum += arr[i++];

                if (count == nechet) {
                    sum += tempSum;
                    count = 0;
                    if (nechet != 1) {
                        i = i - (nechet - 1);
                    }
                    tempSum = 0;
                }

            }

            nechet += 2;
            i = 0;
        }

        return sum;
    }



}
