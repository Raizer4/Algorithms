package practice.leetcode.leetcode_75.decision.day_21.similar;

// Destination City
// https://leetcode.com/problems/destination-city/description/

import java.util.*;

public class Leetcode_1436 {

    public static void main(String[] args) {
        ArrayList<List<String>> list = new ArrayList<>();

        ArrayList<String> list_2 = new ArrayList<>();
        list_2.add("B");
        list_2.add("C");

        ArrayList<String> list_3 = new ArrayList<>();
        list_3.add("B");
        list_3.add("D");

        ArrayList<String> list_4 = new ArrayList<>();
        list_4.add("C");
        list_4.add("A");

        list.add(list_2);
        list.add(list_3);
        list.add(list_4);

        System.out.println(destCity(list));
    }

    public static String destCity(List<List<String>> paths) {
        HashMap<String,String> map = new HashMap<>();

        for (List<String> list : paths){
            map.put(list.get(0),list.get(1));
        }

        int max = Integer.MIN_VALUE;
        String res = "";

        for (Map.Entry entry : map.entrySet()){
            List recurs = recurs(map, entry);
            max = Math.max((Integer) recurs.get(0),max);

            if (max == (Integer) recurs.get(0)){
                res = (String) recurs.get(1);
            }
        }

        return res;
    }

    private static List recurs(HashMap<String,String> map, Map.Entry entry){
        int depth = 1;

        String t = (String) entry.getKey();
        String value = (String) entry.getValue();

        while (map.containsKey(value)){
            value = map.get(value);
            depth++;
        }

        List res = new ArrayList();
        res.add(depth);
        res.add(value);
        return res;
    }

}
