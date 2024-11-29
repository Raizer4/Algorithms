package practice.challenge.leetcode_75.decision.day_22.similar;

// Check if All Characters Have Equal Number of Occurrences
// https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/description/

import java.util.HashMap;


public class Leetcode_1941 {

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("mmmccmm"));
    }

    public static boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for (char temp : s.toCharArray()){
            map.put(temp,map.getOrDefault(temp,0) + 1);
        }

        Integer integer = map.get(s.charAt(0));

        for (Integer temp : map.values()){
            if (!integer.equals(temp)){
                return false;
            }
        }

        return true;
    }

}
