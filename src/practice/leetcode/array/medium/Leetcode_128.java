package practice.leetcode.array.medium;

// Longest Consecutive Sequence
// https://leetcode.com/problems/longest-consecutive-sequence/description/

import java.util.Set;
import java.util.TreeSet;

public class Leetcode_128 {

    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{100,4,200,1,3,2}));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();

        int count = 0;

        for (int temp : nums){
            set.add(temp);
        }

        for (Integer temp : set){
            if (!set.contains(temp - 1)){
                int length = 0;

                while (set.contains(temp + length)){
                    length++;
                }

                count = Math.max(count, length);
            }
        }

        return count;
    }

}
