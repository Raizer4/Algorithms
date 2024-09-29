package practice.leetcode.string.easy;

// Backspace String Compare
// https://leetcode.com/problems/backspace-string-compare/description/

public class Leetcode_844 {

    public static void main(String[] args) {
        System.out.println(backspaceCompare("ab #c","ad #c"));
        System.out.println(backspaceCompare("ab ##","c # d #"));
        System.out.println(backspaceCompare("y # fo ## f","y # f # o ## f"));
    }

    public static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    private static String buildString(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c != '#' && c != ' ') {
                result.append(c);
            } else if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }
        return result.toString();
    }

}
