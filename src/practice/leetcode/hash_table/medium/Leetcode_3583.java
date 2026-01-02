package practice.leetcode.hash_table.medium;

// Count Special Triplets
// https://leetcode.com/problems/count-special-triplets/description/?envType=daily-question&envId=2025-12-09

import java.util.HashMap;

public class Leetcode_3583 {

    public static void main(String[] args) {
        System.out.println(specialTriplets(new int[]{0,1,0,0}));;
    }

    public static int specialTriplets(int[] nums) {
        HashMap<Integer, Long> mapNext = new HashMap<>();

        for (int temp : nums){
            mapNext.put(temp, mapNext.getOrDefault(temp, 0L) + 1L);
        }

        HashMap<Integer,Long> mapPrev = new HashMap<>();
        mapPrev.put(nums[0], 1L);

        long answer = 0;
        final int MOD = 1_000_000_007;

        for (int i = 1; i < nums.length - 1; i++) {
            int num = (nums[i] * 2);
            if (mapPrev.containsKey(num) && mapNext.containsKey(num)){
                long leftCount = mapPrev.get(num);
                long rightCount = mapNext.get(num);

                if (num == nums[i]){
                    rightCount--;
                }

                long temp = leftCount * (rightCount - leftCount) % MOD;
                answer = (answer + temp) % MOD;
            }

            mapPrev.put(nums[i], mapPrev.getOrDefault(nums[i],0L) + 1L);
        }


        return (int) answer;
    }

}
