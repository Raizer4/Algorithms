package practice.leetcode;

// Find the Index of the First Occurrence in a String
// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class Leetcode_28 {

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad","sad"));
        System.out.println(strStr("leetcode","leeto"));
    }


    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
