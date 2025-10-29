package practice.leetcode.siliding_window.medium;

// Maximum Number of Occurrences of a Substring
// https://leetcode.com/problems/maximum-number-of-occurrences-of-a-substring/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_1297 {

    public static void main(String[] args) {
        System.out.println(maxFreq("aababcaab", 2, 3, 4));
    }

    public static int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        Map<Character, Integer> map = new HashMap<>();
        Map<String, Integer> hashMap = new HashMap<>();
        int answer = 0;

        int l = 0;
        int r = 0;

        int uniq = 0;

        while (r < s.length()){
            if (!map.containsKey(s.charAt(r))){
                map.put(s.charAt(r), 1);
                uniq++;
            }else {
                map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            }

            while (uniq > maxLetters){
                int num = map.get(s.charAt(l));

                if (num == 1){
                    map.remove(s.charAt(l));
                    uniq--;
                }else {
                    map.put(s.charAt(l), num - 1);
                }

                l++;
            }

            if ((r - l + 1) == minSize){
                String temp = s.substring(l, r + 1);
                int num = (hashMap.getOrDefault(temp, 0) + 1);
                hashMap.put(temp, num);
                answer = Math.max(answer, num);
                int glax = map.get(s.charAt(l));

                if (glax == 1){
                    map.remove(s.charAt(l));
                    uniq--;
                }else {
                    map.put(s.charAt(l), glax - 1);
                }
                l++;
            }

            r++;
        }

        return answer;
    }

}
