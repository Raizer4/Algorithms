package practice.leetcode.array.easy;

// Shortest Distance to a Character
// https://leetcode.com/problems/shortest-distance-to-a-character/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_821 {

    public static void main(String[] args) {
        int[] ints = shortestToChar("loveleetcode", 'e');

        for (int temp : ints){
            System.out.print(temp + " ");
        }

    }

    public static int[] shortestToChar(String s, char c) {
        int[] res = new int[s.length()];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == c){
                list.add(i);
            }
        }


        for (int k = 0; k < res.length; k++) {
            res[k] = maxClose(k,list);
        }

        return res;
    }

    private static int maxClose(int num,List<Integer> list) {
        int min = Integer.MAX_VALUE;

        for (int temp : list){
            int i = Math.abs(temp - num);

            if (min > i){
                min = i;
            }
        }
        return min;
    }


}
