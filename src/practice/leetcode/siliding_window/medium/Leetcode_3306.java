package practice.leetcode.siliding_window.medium;

// Count of Substrings Containing Every Vowel and K Consonants II
// https://leetcode.com/problems/count-of-substrings-containing-every-vowel-and-k-consonants-ii/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_3306 {

    public static void main(String[] args) {
        System.out.println(countOfSubstrings("aeioqq", 1));
    }

    public static long countOfSubstrings(String word, int k) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "aoieu";

        long answer = 0;

        int l = 0;
        int vowels = 0;
        int consonant = 0;
        int num = 0;

        for (int r = 0; r < word.length(); r++) {
            char c = word.charAt(r);

            if (str.indexOf(c) != -1){
                if (!map.containsKey(c)){
                    vowels++;
                    map.put(c, 1);
                }else {
                    map.put(c, map.get(c) + 1);
                }
            }else {
                consonant++;
            }

            while (vowels == 5 && consonant > k){
                 char temp = word.charAt(l);

                 if (str.indexOf(temp) == -1){
                     consonant--;
                 }else {
                     int integer = map.get(temp);

                     if (integer == 1){
                         vowels--;
                         map.remove(temp);
                     }else {
                         map.put(temp, integer - 1);
                     }
                 }

                 num = 0;
                 l++;
            }

            while (vowels == 5 && consonant == k){
                char temp = word.charAt(l);

                if (str.indexOf(temp) == -1){
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

            if (vowels == 5 && consonant == k){
                answer += (1 + num);
            }

        }

        return answer;
    }

}
