package practice.leetcode.leetcode_75;

// Removing Stars From a String
// https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.HashMap;
import java.util.Map;

public class Leetcode_2390 {

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("erase*****"));
    }

    public static String removeStars(String s) {
        StringBuilder builder = new StringBuilder();

        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                map.put(i, 1);
            }
        }

        if (map.keySet().size() >= s.length()){
            return "";
        }

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != '*') {
                builder.append(s.charAt(i));
            }

            if (map.containsKey(i)) {
                Integer integer = map.get(i);
                do {
                    builder.deleteCharAt(builder.length() - integer);
                    integer--;
                } while (integer != 0);
            }

        }

        return builder.toString();
    }

}
