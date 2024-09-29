package practice.leetcode;

import java.util.*;

public class Leetcode_1002 {

    public static void main(String[] args) {
        System.out.println(commonChars(new String[]{"bella","label","roller"}));
        System.out.println(commonChars(new String[]{"cool","lock","cook"}));
    }

    public static Set<Character> commonChars(String[] words) {
        HashMap<Character, Integer> map = new HashMap<>();

        Set<Character> set = new TreeSet<>();

        for (String temp : words){
            for (Character character : temp.toCharArray()){
                set.add(character);
            }
            for (Character character : set){
                map.put(character,map.getOrDefault(character,0)+ 1);
            }
        }

      return null;

    }

}
