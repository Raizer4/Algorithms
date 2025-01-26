package practice.leetcode.hash_table.easy;

// Isomorphic Strings
// https://leetcode.com/problems/isomorphic-strings/description/

import java.util.HashMap;
import java.util.Map;


public class Leetcode_205 {

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("bbbaaaba","aaabbbba"));
    }

    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> mapS = new HashMap<>();
        Map<Character, Character> mapT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if (mapS.containsKey(charS) && mapS.get(charS) != charT) return false;
            if (mapT.containsKey(charT) && mapT.get(charT) != charS) return false;

            mapS.put(charS, charT);
            mapT.put(charT, charS);
        }

        return true;
    }


}
