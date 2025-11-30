package practice.leetcode.siliding_window.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Minimum Window Substring
// https://leetcode.com/problems/minimum-window-substring/description/

public class Leetcode_30 {

    private static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println(findSubstring("lingmindraboofooowingdingbarrwingmonkeypoundcake", new String[]{"fooo","barr","wing","ding","wing"}));
        System.out.println(findSubstring("barfoothefoobarman", new String[]{"foo","bar"}));
        System.out.println(findSubstring("a", new String[]{"a","a"}));
        System.out.println(findSubstring("bcabbcaabbccacacbabccacaababcbb", new String[]{"c","b","a","c","a","a","a","b","c"}));
        System.out.println(findSubstring("b", new String[]{"bbb","bbb"}));
    }

    public static List<Integer> findSubstring(String s, String[] words) {
        HashMap<String, Integer> map = new HashMap<>();

        for (String temp : words){
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        int length = words[0].length();

        for (int i = 0; i < length; i++) {
            check(s, map, i,length, words.length);
        }

        return list;
    }

    private static void check(String s, HashMap<String, Integer> map, Integer start, Integer length, Integer count){
        HashMap<String, Integer> mas = new HashMap<>();

        for (int i = start; i < (start + length * count) && i < s.length(); i+= length) {
            String substring;
            if (i + length < s.length()){
                substring = s.substring(i, i + length);
            }else {
                substring = s.substring(i, s.length());
            }

            mas.put(substring, mas.getOrDefault(substring, 0) + 1);
        }

        process(s,mas,map,start,length,count);
    }

    private static void process(String s,
                                HashMap<String, Integer> map,
                                HashMap<String, Integer> words,
                                Integer start,
                                Integer length,
                                Integer count)
    {
        int sum = 0;

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                sum -= entry.getValue();
            } else if (map.get(entry.getKey()) != entry.getValue()) {
                sum -= Math.abs(map.get(entry.getKey()) - entry.getValue());
            }
        }


        while ((start + length * count) + length <= s.length()) {
            if (sum == 0){
                list.add(start);
            }

            String firts = s.substring(start, (start + length));
            int temp = (start + length * count);
            String end = s.substring(temp, temp + length);


            if (words.containsKey(firts)) {
                Integer i = map.get(firts);
                if (i > 1 && (i - 1) >= words.get(firts)) {
                    sum += 1;
                } else {
                    sum -= 1;
                }
            }else {
                sum += 0;
            }

            Integer i = map.get(firts);
            if (i == 1){
                map.remove(firts);
            }else {
                map.put(firts, i - 1);
            }

            if (words.containsKey(end)){
                Integer i1 = map.getOrDefault(end,0);
                Integer i2 = words.get(end);

                if (i1 < i2){
                    sum += 1;
                }else {
                    sum -= 1;
                }

            }else {
                sum -= 0;
            }

            map.put(end, map.getOrDefault(end, 0) + 1);
            start += length;
        }

        if (sum == 0){
            list.add(start);
        }
    }

}
