package practice.leetcode;

// Subarrays with K Different Integers
// https://leetcode.com/problems/subarrays-with-k-different-integers/description/

import java.util.HashMap;


public class Leetcode_992 {

    public static void main(String[] args) {
        System.out.println(subarraysWithKDistinct(new int[]{1,2,1,2,3}, 2));
        System.out.println(subarraysWithKDistinct(new int[]{1,2,1,3,4}, 3));
        System.out.println(subarraysWithKDistinct(new int[]{2,2,1,2,2,2,1,1}, 2));
        System.out.println(subarraysWithKDistinct(new int[]{1,2}, 1));
    }

    public static int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int l = 0;
        int r = 0;
        int answer = 0;
        int uniq = 0;
        int count = 0;

        while (r < nums.length){

            if (!map.containsKey(nums[r])){
                map.put(nums[r], 1);
                uniq++;
            }else {
                map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);
            }


            while (uniq > k || (uniq == k && map.containsKey(nums[l]) && map.get(nums[l]) > 1)){
                int temp = map.get(nums[l]);

                if (temp == 1){
                    map.remove(nums[l]);
                    uniq--;
                    count = 0;
                }else {
                    map.put(nums[l], map.get(nums[l]) - 1);
                    count++;
                }

                l++;
            }

            if (uniq == k){
                answer += (1 + count);
            }

            r++;
        }

        return answer;
    }



}
