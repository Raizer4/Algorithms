package practice.leetcode.hash_table.easy;

// Word Pattern
// https://leetcode.com/problems/word-pattern/description/

import java.util.HashMap;


public class Leetcode_290 {

    public static void main(String[] args) {
        System.out.println(wordPattern("abba","dog cat cat dog"));
        System.out.println(wordPattern("abba","dog cat cat fish"));
        System.out.println(wordPattern("aaaa","dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map = new HashMap<>();

        if (pattern.length() != s.split(" ").length){
            return false;
        }

        String[] arr = s.split(" ");

        for (int i = 0; i < arr.length; i++){
            if (!map.containsKey(pattern.charAt(i)) && !map.values().contains(arr[i])) {
                map.put(pattern.charAt(i), arr[i]);
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < pattern.length(); i++){
            builder.append(map.get(pattern.charAt(i)));
            builder.append(" ");
        }

        return builder.toString().trim().equals(s);
    }

}
