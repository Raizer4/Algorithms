package practice.leetcode.siliding_window.medium;

// Count the Number of Good Subarrays
// https://leetcode.com/problems/count-the-number-of-good-subarrays/description/

import java.util.HashMap;

public class Leetcode_2537 {

    public static void main(String[] args) {
        System.out.println(countGood(new int[]{1,1,1,1}, 6));
    }

    public static long countGood(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        long count = 0;
        long totalPairs = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            int cnt = map.getOrDefault(num, 0);
            totalPairs += cnt;
            map.put(num, cnt + 1);

            while (totalPairs >= k){
                count += nums.length - right;

                int leftNum = nums[left];
                int leftCnt = map.get(leftNum);
                totalPairs -= leftCnt - 1;
                map.put(leftNum, leftCnt - 1);
                left++;
            }
        }

        return count;
    }


}
