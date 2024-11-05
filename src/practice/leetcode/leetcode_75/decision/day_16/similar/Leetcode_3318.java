package practice.leetcode.leetcode_75.decision.day_16.similar;

// Find X-Sum of All K-Long Subarrays I
// https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/description/

import java.util.*;

public class Leetcode_3318 {

    public static void main(String[] args) {
        int[] xSum = findXSum(new int[]{1, 1, 2, 2, 3, 4, 2, 3}, 6, 2);

        for (int temp : xSum){
            System.out.print(temp + " ");
        }

    }

    public static int[] findXSum(int[] nums, int k, int x) {
        int[] result = new int[nums.length - k + 1];
        int index = 0;
        int iTemp = 0;

        while (k <= nums.length){
            Map<Integer,Integer> map = new HashMap<>();
            int i = iTemp++;

            while (i < k){
                map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
                i++;
            }

            result[index++] = counting(map,x);
            k++;
        }

        return result;
    }

    private static int counting(Map<Integer,Integer> map, int x){
        List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(map.entrySet());

        entries.sort((e1, e2) -> {
            int cmp = Integer.compare(e2.getValue(), e1.getValue());
            if (cmp == 0) {
                return Integer.compare(e2.getKey(), e1.getKey());
            }
            return cmp;
        });

        int sum = 0;

        int i = 0;
        for (Map.Entry<Integer, Integer> entry : entries) {
            if (i == x){
                break;
            }
            int key = entry.getKey();
            int value = entry.getValue();
            sum += key * value;
            i++;
        }

        return sum;
    }

}
