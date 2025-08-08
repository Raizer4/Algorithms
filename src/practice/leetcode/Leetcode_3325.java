package practice.leetcode;

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

        int num = 0;
        int count = 0;
        int l = 0;
        int answer = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }

            if (((map.get(c)) >= k)){
                num++;
            }

            while (l < i && num >= 1 && map.containsKey(s.charAt(l)) && map.get(s.charAt(l)) < k){
                count++;

                int integer = map.get(s.charAt(l));

                if (integer == 1){
                    map.remove(s.charAt(l));
                }else {
                    map.put(s.charAt(l), integer - 1);
                }

                l++;
            }

            if (num >= 1){
                int temp = s.length() - i;
                answer += (temp);
                answer +=  (temp * count);

                while (l < i && num >= 1){
                    char let = s.charAt(l);

                    int integer = map.get(let);

                    if (integer == k){
                        num--;
                    }

                    if (integer == 1){
                        map.remove(let);
                    }else {
                        map.put(let, integer - 1);
                    }

                    count = 0;
                    num = 0;
                    l++;
                }
            }
        }

        return answer;
    }

}
