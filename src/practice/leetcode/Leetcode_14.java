package practice.leetcode;

// Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/description/

import java.util.*;

public class  Leetcode_14 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"a"}));
        System.out.println(longestCommonPrefix(new String[]{"", ""}));
        System.out.println(longestCommonPrefix(new String[]{"ad", "a"}));

    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder();

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {

            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }

            ans.append(first.charAt(i));
        }

        return ans.toString();
    }

}
