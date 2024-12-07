package practice.leetcode.hash_table.medium;

// Group Anagrams
// https://leetcode.com/problems/group-anagrams/description/

import java.util.*;

public class Leetcode_49 {

    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<List<Character>, List<String>> map = new HashMap<>();

        for (String temp : strs){
            List<Character> list = new ArrayList<>();

            for (Character c : temp.toCharArray()){
                list.add(c);
            }

            Collections.sort(list);

            List<String> orDefault = map.getOrDefault(list, new ArrayList());
            orDefault.add(temp);
            map.put(list, orDefault);
        }

        List<List<String>> res = new ArrayList<>();

        for (List<String> temp : map.values()){
            res.add(temp);
        }

        return res;
    }

}
