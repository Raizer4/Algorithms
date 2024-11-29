package practice.challenge.leetcode_75.decision.day_20.similar;

// Kth Distinct String in an Array
// https://leetcode.com/problems/kth-distinct-string-in-an-array/description/

import java.util.*;

public class Leetcode_2053 {

    public static void main(String[] args) {
        System.out.println(kthDistinct(new String[]{"d","b","c","b","c","a"},2));
        System.out.println(kthDistinct(new String[]{"aaa", "aa", "a"},1));
        System.out.println(kthDistinct(new String[]{"a", "b", "a"},3));
    }

    public static String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map = new HashMap<>();
        List<String> set = new ArrayList<>();

        for (String temp : arr){
            map.put(temp,map.getOrDefault(temp,0) + 1);
            set.add(temp);
        }

        int i = 0;

        for (String str : set){
            if (map.get(str) == 1){
                i++;
            }
            if (i == k && map.get(str) == 1){
                return str;
            }
        }

        return "";
    }

}
