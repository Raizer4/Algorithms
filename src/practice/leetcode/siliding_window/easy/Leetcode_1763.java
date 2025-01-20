package practice.leetcode.siliding_window.easy;

// Longest Nice Substring
// https://leetcode.com/problems/longest-nice-substring/description/

import java.util.*;

public class Leetcode_1763 {

    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("cChH"));
        System.out.println(longestNiceSubstring("YazaAay"));
        System.out.println(longestNiceSubstring("Bb"));
        System.out.println(longestNiceSubstring("C"));
    }

    public static String longestNiceSubstring(String s) {
        int n = s.length();
        if (n < 2) return "";

        String result = "";

        for (int i = 0; i < n; i++) {
            Set<Character> seen = new HashSet<>();
            for (int j = i; j < n; j++) {
                seen.add(s.charAt(j));

                if (isNice(seen)) {
                    String candidate = s.substring(i, j + 1);
                    if (candidate.length() > result.length()) {
                        result = candidate;
                    }
                }
            }
        }

        return result;
    }

    private static boolean isNice(Set<Character> seen){
        for (char c : seen) {
            if (!seen.contains(Character.toLowerCase(c)) || !seen.contains(Character.toUpperCase(c))) {
                return false;
            }
        }
        return true;
    }

}
