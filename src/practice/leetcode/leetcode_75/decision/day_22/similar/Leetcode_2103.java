package practice.leetcode.leetcode_75.decision.day_22.similar;

// Rings and Rods
// https://leetcode.com/problems/rings-and-rods/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Leetcode_2103 {

    public static void main(String[] args) {
        System.out.println(countPoints("B0B6G0R6R0R6G9"));
    }

    public static int countPoints(String rings) {
        int count = 0;

        HashMap<Integer, List<Character>> map = new HashMap<>();

        for (int i = 0; i < rings.length(); i+=2){
            int c = Integer.parseInt(String.valueOf(rings.charAt(i + 1)));
            List<Character> orDefault = map.getOrDefault(c, new ArrayList<>());
            orDefault.add(rings.charAt(i));
            map.put(c,orDefault);
        }

        for (List<Character> temp : map.values()){
            if (temp.contains('R') && temp.contains('G') && temp.contains('B')){
                count++;
            }
        }

        return count;
    }

}
