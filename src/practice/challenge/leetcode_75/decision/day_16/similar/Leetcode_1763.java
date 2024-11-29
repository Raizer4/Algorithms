package practice.challenge.leetcode_75.decision.day_16.similar;

// Longest Nice Substring
// https://leetcode.com/problems/longest-nice-substring/description/

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1763 {

    public static void main(String[] args) {
        System.out.println(longestNiceSubstring("cChH"));
        System.out.println(longestNiceSubstring("YazaAay"));
        System.out.println(longestNiceSubstring("Bb"));
        System.out.println(longestNiceSubstring("C"));
    }

    public static String longestNiceSubstring(String s) {
        Set<Character> set = new HashSet();

        for(char c : s.toCharArray()){
            set.add(c);
        }

        for(int i = 0; i < s.length(); i++){
            if(set.contains(Character.toUpperCase(s.charAt(i))) && set.contains(Character.toLowerCase(s.charAt(i)))) {
                continue;
            }

            String s1 = longestNiceSubstring(s.substring(0, i));
            String s2 = longestNiceSubstring(s.substring(i+1));
            return s1.length() >= s2.length() ? s1 : s2;
        }

        return s;
    }



}
