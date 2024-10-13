package practice.leetcode;

// Remove Outermost Parentheses
// https://leetcode.com/problems/remove-outermost-parentheses/description/


public class Leetcode_1021 {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();

        int level = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (level > 0) {
                    result.append(c);
                }
                level++;
            } else if (c == ')') {
                level--;
                if (level > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

}
