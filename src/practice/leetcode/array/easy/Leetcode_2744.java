package practice.leetcode.array.easy;

// Find Maximum Number of String Pairs
// https://leetcode.com/problems/find-maximum-number-of-string-pairs/description/

import java.util.*;

public class Leetcode_2744 {

    public static void main(String[] args) {
        System.out.println(maximumNumberOfStringPairs(new String[]{"cd","ac","dc","ca","zz"}));
        System.out.println(maximumNumberOfStringPairs(new String[]{"ab","ba","cc"}));
        System.out.println(maximumNumberOfStringPairs(new String[]{"aa","ab"}));
    }

    public static int maximumNumberOfStringPairs(String[] words) {
        Set<String> set = new TreeSet<>();

        int count = 0;

        for (int i = 0; i < words.length; i++){
            if (set.contains(words[i])){
                count++;
            }else {
                set.add(new StringBuilder(words[i]).reverse().toString());
            }
        }

        return count;
    }



}
