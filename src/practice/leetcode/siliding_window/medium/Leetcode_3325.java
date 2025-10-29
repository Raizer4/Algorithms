package practice.leetcode.siliding_window.medium;

// Count Substrings With K-Frequency Characters I
// https://leetcode.com/problems/count-substrings-with-k-frequency-characters-i/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_3325 {

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("biikmbqb", 2));
    }

    public static int numberOfSubstrings(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();

        int count = 0;
        int l = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            Integer put = map.getOrDefault(c,0) + 1;
            map.put(c, put);

            while (l < i && put >= k && map.get(s.charAt(l)) < k){
                count++;

                int integer = map.get(s.charAt(l));

                if (integer == 1){
                    map.remove(s.charAt(l));
                }else {
                    map.put(s.charAt(l), integer - 1);
                }

                l++;
            }

            if (put >= k) {
                int temp = s.length() - i;
                answer += (temp);
                answer += (temp * count);

                char let = s.charAt(l);
                int integer = map.get(let);

                if (integer == 1) {
                    map.remove(let);
                } else {
                    map.put(let, integer - 1);
                }

                count = 0;
                l++;
            }
        }

        return answer;
    }

}
