package practice.leetcode;

// Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/description/

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Leetcode_14 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"a"}));
        System.out.println(longestCommonPrefix(new String[]{"", ""}));
        System.out.println(longestCommonPrefix(new String[]{"ad", "a"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        List<String> list = Arrays.asList(strs);

        if (list.contains("")) {
            return "";
        }

        int size = Collections.min(list, Comparator.comparingInt(String::length)).length();

        int count = 0;

        while (true) {
            String str = strs[0];

            char c = str.charAt(count);
            boolean flag = true;

            for (int j = 0; j < strs.length; j++) {
                if (strs[j].charAt(count) != c) {
                    flag = false;
                }
            }

            if (flag) {
                count++;
                if (count >= size) {
                    return str.substring(0, count);
                }
            } else {
                return str.substring(0, count);
            }
        }


    }

}
