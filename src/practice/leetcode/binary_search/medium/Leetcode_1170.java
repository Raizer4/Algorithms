package practice.leetcode.binary_search.medium;

// Compare Strings by Frequency of the Smallest Character
// https://leetcode.com/problems/compare-strings-by-frequency-of-the-smallest-character/description/

import java.util.*;

public class Leetcode_1170 {

    public static void main(String[] args) {
         System.out.println(numSmallerByFrequency(new String[]{"bbb","cc"}, new String[]{"a","aa","aaa","aaaa"}));
         System.out.println(numSmallerByFrequency(new String[]{"cbd"}, new String[]{"zaaaz"}));
    }

    public static int[] numSmallerByFrequency(String[] queries, String[] words) {
        List<Integer> word = parseToArray(words);

        int[] answer = new int[queries.length];
        int index = 0;

        for (String str : queries){
            int temp = parsing(str);

            int l = 0;
            int r = word.size() - 1;

            int num = word.size();

            while (l <= r){
                int m = l + (r - l) / 2;

                if (word.get(m) > temp){
                    num = m;
                    r = m - 1;
                }else {
                    l = m + 1;
                }
            }

            answer[index++] = words.length - num;
        }

        return answer;
    }

    private static List<Integer> parseToArray(String[] arr){
        List<Integer> list = new ArrayList<>();

        for (String str : arr){
            list.add(parsing(str));
        }

        Collections.sort(list);

        return list;
    }

    private static Integer parsing(String str) {
        HashMap<Character, Integer> map = new HashMap();

        int min = Integer.MAX_VALUE;

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            int temp = c - 'a' + 1;
            min = Math.min(min, temp);
        }

        return map.get((char) (min + 'a' - 1));
    }

}


