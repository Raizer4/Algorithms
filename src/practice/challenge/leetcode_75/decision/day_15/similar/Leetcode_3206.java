package practice.challenge.leetcode_75.decision.day_15.similar;

// Alternating Groups I
// https://leetcode.com/problems/alternating-groups-i/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_3206 {

    public static void main(String[] args) {
        System.out.println(numberOfAlternatingGroups(new int[]{0,1,0,0,1}));
    }

    public static int numberOfAlternatingGroups(int[] colors) {
        List<Integer> list = new ArrayList<>();

        for (int temp : colors){
            list.add(temp);
        }
        list.add(0, colors[colors.length - 1]);
        list.add(colors[0]);

        int count = 0;

        int i = 0;

        while (i < colors.length) {
           if (list.get(i) == list.get(i + 2) && list.get(i) != list.get(i + 1)){
               count++;
           }
           i++;
        }

        return count;
    }

}
