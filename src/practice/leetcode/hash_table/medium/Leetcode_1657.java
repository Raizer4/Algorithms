package practice.leetcode.hash_table.medium;

// Determine if Two Strings Are Close
// https://leetcode.com/problems/determine-if-two-strings-are-close/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.*;

public class Leetcode_1657 {

    public static void main(String[] args) {
        System.out.println(closeStrings("abc","bca"));
        System.out.println(closeStrings("a","aa"));
        System.out.println(closeStrings("cabbba","abbccc"));
    }

    public static boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        HashMap<Character, Integer> map_1 = new HashMap<>();
        HashMap<Character, Integer> map_2 = new HashMap<>();

        for (char temp : word1.toCharArray()) {
            map_1.put(temp, map_1.getOrDefault(temp, 0) + 1);
        }

        for (char temp : word2.toCharArray()) {
            map_2.put(temp, map_2.getOrDefault(temp, 0) + 1);
        }


        if (!map_1.keySet().equals(map_2.keySet())) {
            return false;
        }

        List<Integer> values_1 = new ArrayList<>(map_1.values());
        List<Integer> values_2 = new ArrayList<>(map_2.values());

        Collections.sort(values_1);
        Collections.sort(values_2);

        return values_1.equals(values_2);

    }



}
