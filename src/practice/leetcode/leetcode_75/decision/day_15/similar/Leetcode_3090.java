package practice.leetcode.leetcode_75.decision.day_15.similar;

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
        Map<Character, Integer> charCount = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);

            while (charCount.get(rightChar) > 2) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);
                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }
                left++;
            }

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }



}
