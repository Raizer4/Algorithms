package practice.leetcode.siliding_window.medium;

// Count of Substrings Containing Every Vowel and K Consonants I
// https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-i/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_3305 {

    public static void main(String[] args) {
        System.out.println(countOfSubstrings("uiuuoae ", 0));
    }

    public static int countOfSubstrings(String word, int k) {
        Map<Character, Integer> map = new HashMap();

        String str = "aeiou";

        int l = 0;

        int count = 0;
        int uniq = 0;
        int num = 0;
        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (str.indexOf(c) != -1){
                if (!map.containsKey(c)){
                    uniq++;
                    map.put(c, 1);
                }else {
                    map.put(c, map.get(c) + 1);
                }
            }else {
                count++;
            }

            while (uniq == 5 && count > k){
                char temp = word.charAt(l);

                if (str.indexOf(temp) == -1){
                    count--;
                }else {
                    Integer integer = map.get(temp);

                    if (integer == 1){
                        map.remove(temp);
                        uniq--;
                    }else {
                        map.put(temp, integer - 1);
                    }
                }

                num = 0;
                l++;
            }

            while (uniq == 5 && count == k){
                char temp = word.charAt(l);

                if (!map.containsKey(temp)){
                    break;
                }

                int integer = map.get(temp);

                if (integer == 1){
                    break;
                }else {
                    num++;
                    map.put(temp, integer - 1);
                }

                l++;
            }

            if (uniq == 5 && count == k){
                answer += (1 + num);
            }

        }

        return answer;
    }

}
