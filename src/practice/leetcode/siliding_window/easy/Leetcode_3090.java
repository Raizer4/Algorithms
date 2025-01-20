package practice.leetcode.siliding_window.easy;

// Maximum Length Substring With Two Occurrences
// https://leetcode.com/problems/maximum-length-substring-with-two-occurrences/description/

import java.util.*;


public class Leetcode_3090 {

    public static void main(String[] args) {
        System.out.println(maximumLengthSubstring("bcbbbcba"));
        System.out.println(maximumLengthSubstring("ааааа"));
        System.out.println(maximumLengthSubstring("eebadadbfa"));
        System.out.println(maximumLengthSubstring("bbbab"));
        System.out.println(maximumLengthSubstring("bcbbbcba"));
    }

    public static int maximumLengthSubstring(String s) {
       Map<Character, Integer> map = new HashMap<>();

       int l = 0;
       int count = 0;


        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r),0) + 1);

            while (map.get(s.charAt(r)) > 2){
                 map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                 l++;
            }

            count = Math.max(count,r - l + 1);
        }

        return count;
    }



}
