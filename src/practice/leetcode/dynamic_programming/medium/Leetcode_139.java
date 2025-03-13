package practice.leetcode.dynamic_programming.medium;

// Word Break
// https://leetcode.com/problems/word-break/description/

import java.util.Arrays;
import java.util.List;

public class Leetcode_139 {

    public static void main(String[] args) {
        System.out.println(wordBreak("abcd", Arrays.asList("a","abc","b","cd")));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] booleans = new boolean[s.length() + 1];
        booleans[s.length()] = true;

        for (int i = s.length() - 1; i >= 0; i--) {
            for (String str : wordDict){
                if ( (i + str.length()) <= s.length() && s.substring(i,  i + str.length()).equals(str)){
                    booleans[i] = booleans[i + str.length()];
                }

                if (booleans[i]){
                    break;
                }

            }
        }

        return booleans[0];
    }

}
