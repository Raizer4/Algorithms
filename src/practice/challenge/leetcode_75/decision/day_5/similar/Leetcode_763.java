package practice.challenge.leetcode_75.decision.day_5.similar;

// Partition Labels
// https://leetcode.com/problems/partition-labels/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Leetcode_763 {

    public static void main(String[] args) {
        System.out.println(partitionLabels("caedbdedda"));
        System.out.println(partitionLabels("ababcbacadefegdehijhklij"));
        System.out.println(partitionLabels("eccbbbbdec"));
    }

    public static List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();

        HashMap<Character, Integer> map = new HashMap();

        for (Character temp : s.toCharArray()){
            int i = map.getOrDefault(temp, 0) + 1;
            map.put(temp,i);
        }

        Set<Character> keySet = map.keySet();
        List<Character> characterList = new ArrayList<>();

        for (Character temp : s.toCharArray()){
            if (!characterList.contains(temp)) {
                characterList.add(temp);
            }
        }

        List<Character> t = new ArrayList<>();

        int integer = 0;

        for (int i = 0; i < keySet.size(); i++){
            char c = characterList.get(i);
            integer += map.get(c);
            t.add(c);

            boolean flag = true;

            for (int j = 0; j < integer; j++){
                if (!t.contains(s.charAt(j))){
                    flag = false;
                    break;
                }
            }

            if (flag){
                result.add(integer);
                String substring = s.substring(integer, s.length());
                s = substring;
                integer = 0;
                t.clear();
            }

        }

        return result;
    }


}
