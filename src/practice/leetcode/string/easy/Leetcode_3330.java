package practice.leetcode.string.easy;

// Find the Original Typed String I
// https://leetcode.com/problems/find-the-original-typed-string-i/description/?envType=daily-question&envId=2025-07-01

public class Leetcode_3330 {

    public static void main(String[] args) {
        System.out.println(possibleStringCount("abbcccc"));
    }

    public static int possibleStringCount(String word) {
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i - 1) == word.charAt(i)){
                count++;
            }
        }

        return count;
    }

}
