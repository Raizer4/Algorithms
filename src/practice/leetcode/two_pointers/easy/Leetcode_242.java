package practice.leetcode.two_pointers.easy;

// Valid Anagram
// https://leetcode.com/problems/valid-anagram/description/

import java.util.*;

public class Leetcode_242 {

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram","nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        char[] chars_1 = s.toCharArray();
        Arrays.sort(chars_1);
        char[] chars_2 = t.toCharArray();
        Arrays.sort(chars_2);

        if (chars_1.length != chars_2.length){
            return false;
        }

        int i = 0;

        for (char temp : chars_1){
            if (chars_2[i++] != temp){
                return false;
            }
        }

        return true;
    }

}
