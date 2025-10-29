package practice.leetcode.siliding_window.easy;

// Count Vowel Substrings of a String
// https://leetcode.com/problems/count-vowel-substrings-of-a-string/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_2062 {

    public static void main(String[] args) {
        System.out.println(countVowelSubstrings("ughspuuoaaaoieiuiaoiuee"));
    }

    public static int countVowelSubstrings(String word) {
        Map<Character,Integer> map = new HashMap();

        String str = "aoieu";
        int l = 0;
        int uniq = 0;
        int count = 0;
        int answer = 0;

        for (int i = 0; i < word.length(); i++) {
            if (str.indexOf(word.charAt(i)) == -1){
                map.clear();
                l = i + 1;
                uniq = 0;
                count = 0;
                continue;
            }

            if (!map.containsKey(word.charAt(i))){
                uniq++;
                map.put(word.charAt(i), 1);
            }else {
                map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
            }

            while (l < i && map.containsKey(word.charAt(l)) && map.get(word.charAt(l)) > 1){
                map.put(word.charAt(l), map.get(word.charAt(l)) - 1);
                count++;
                l++;
            }

            if (uniq == 5){
                answer += (1 + count);
            }

        }


        return answer;
    }

}
