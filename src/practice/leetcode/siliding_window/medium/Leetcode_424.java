package practice.leetcode.siliding_window.medium;

// Longest Repeating Character Replacement
// https://leetcode.com/problems/longest-repeating-character-replacement/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_424 {

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB", 2));
        System.out.println(characterReplacement("AABABBA", 1));
    }

    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int res = 0;

        int max = 0;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            max = Math.max(max,map.get(s.charAt(r)));

            while ((r - l + 1) - max > k){
                map.put(s.charAt(l), map.getOrDefault(s.charAt(l), 0) - 1);
                l++;
            }

            res = Math.max(res,r - l + 1);
        }


        return res;
    }
}
