package practice.leetcode.siliding_window.medium;

// Longest Substring Without Repeating Characters
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.*;

public class Leetcode_3 {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();

        int res = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++){
            if (map.containsKey(s.charAt(r))){
                l = Math.max(map.get(s.charAt(r)) + 1, l);
            }

            map.put(s.charAt(r), r);
            res = Math.max(res, r - l + 1);
        }

        return res;
    }

}
