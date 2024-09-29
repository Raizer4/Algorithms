package practice.leetcode.hash_table.easy;

// Uncommon Words from Two Sentences
// https://leetcode.com/problems/uncommon-words-from-two-sentences/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_884 {

    public static void main(String[] args) {
        String[] strings = uncommonFromSentences("this apple is sweet", "this apple is sour");
        for (String temp : strings){
            System.out.println(temp);
        }
    }

    public static String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();

        String s = s1 + " " + s2;
        String[] arr = s.split(" ");

        for (String temp : arr){
            map.put(temp,map.getOrDefault(temp,0) + 1);
        }

        List<String> result = new ArrayList<>();

        for (Map.Entry temp : map.entrySet()){
            Integer integer = (Integer) temp.getValue();
            if (integer == 1){
                result.add((String) temp.getKey());
            }
        }

        String[] strings = new String[result.size()];

        for (int i = 0; i < strings.length; i++){
            strings[i] = result.get(i);
        }

        return strings;
    }


}
