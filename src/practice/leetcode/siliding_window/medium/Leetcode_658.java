package practice.leetcode.siliding_window.medium;

// Find K Closest Elements
// https://leetcode.com/problems/find-k-closest-elements/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_658 {

    public static void main(String[] args) {
        System.out.println(findClosestElements(new int[]{1,1,1,10,10,10},1,9));
    }

    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += Math.abs(arr[i] - x);
        }

        int minSum = currentSum;
        int bestLeft = 0;

        for (int i = k; i < arr.length; i++) {
            currentSum -= Math.abs(arr[i - k] - x);
            currentSum += Math.abs(arr[i] - x);

            if (currentSum < minSum) {
                minSum = currentSum;
                bestLeft = i - k + 1;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = bestLeft; i < bestLeft + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }

}
