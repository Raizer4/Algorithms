package practice.challenge.leetcode_75.decision.day_6.similar;

// Append Characters to String to Make Subsequence
// https://leetcode.com/problems/append-characters-to-string-to-make-subsequence/description/

public class Leetcode_2486 {

    public static void main(String[] args) {
        System.out.println(appendCharacters("coaching","coding"));
        System.out.println(appendCharacters("abcde","a"));
        System.out.println(appendCharacters("z","abcde"));
    }

    public static int appendCharacters(String s, String t) {
        int index = 0;

        for (int i = 0; i < s.length(); i++){

            if (s.charAt(i) == t.charAt(index)){
                index++;
            }

            if (index == t.length()){
                return 0;
            }

        }

        return t.length() - index;
    }

}
