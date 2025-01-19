package practice.leetcode.siliding_window.easy;

// Substrings of Size Three with Distinct Characters
// https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/description/


public class Leetcode_1876 {

    public static void main(String[] args) {
        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;

        for (int i = 3; i <= s.length(); i++){
            if (s.charAt(i - 3) != s.charAt(i - 2) && s.charAt(i - 2) != s.charAt(i - 1) && s.charAt(i - 3) != s.charAt(i - 1) ){
                count++;
            }
        }

        return count;
    }



}
