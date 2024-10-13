package practice.leetcode.hash_table.medium;

// Minimum Number of Steps to Make Two Strings Anagram
// https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/description/

import java.util.HashMap;


public class Leetcode_1347 {

    public static void main(String[] args) {
        System.out.println(minSteps("leetcode","practice"));
    }

    public static int minSteps(String s, String t) {
        int count = 0;

        HashMap<Character, Integer> map_s = new HashMap<>();
        HashMap<Character, Integer> map_t = new HashMap<>();

        for (char temp : s.toCharArray()){
            map_s.put(temp,map_s.getOrDefault(temp, 0) + 1);
        }

        for (char temp : t.toCharArray()){
            map_t.put(temp,map_t.getOrDefault(temp,0)+1);
        }

        for (Character temp : map_s.keySet()){
            if (map_t.containsKey(temp)){
                int i = map_s.get(temp) - map_t.get(temp);
                if (i > 0){
                    count += i;
                }
            }else {
                count += map_s.get(temp);
            }
        }

        return count;
    }

}
