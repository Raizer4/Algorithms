package practice.leetcode.siliding_window.hard;

// Minimum Window Substring
// https://leetcode.com/problems/minimum-window-substring/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_76 {

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC","ABC"));
        System.out.println(minWindow("a","a"));
        System.out.println(minWindow("a","aa"));
        System.out.println(minWindow("aa","aa"));

    }

    public static String minWindow(String s, String t) {
        HashMap<Character, Integer> tempMap = new HashMap<>();

        for (char c:t.toCharArray()){
            tempMap.put(c, tempMap.getOrDefault(c,0) + 1);
        }


        HashMap<Character, Integer> map = new HashMap<>();

        int min = Integer.MAX_VALUE;
        int l = 0;
        String res = "";


        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);

            boolean flag = true;

            for (Map.Entry entry : tempMap.entrySet()){
                if (!map.containsKey(entry.getKey()) || map.get(entry.getKey()) < (Integer) entry.getValue()){
                    flag = false;
                    break;
                }
            }

            while (flag){
                int window = r - l + 1;
                min = Math.min(min,window);
                if (min == window){
                    res = s.substring(l, r + 1);
                }
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                if (t.indexOf(s.charAt(l)) != -1 && map.get(s.charAt(l)) < tempMap.get(s.charAt(l))){
                    l++;
                    break;
                }
                l++;
            }

        }

        return res;
    }

}
