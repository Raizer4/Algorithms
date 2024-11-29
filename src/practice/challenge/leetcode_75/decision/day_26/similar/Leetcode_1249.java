package practice.challenge.leetcode_75.decision.day_26.similar;

// Minimum Remove to Make Valid Parentheses
// https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/description/

import java.util.*;

public class Leetcode_1249 {

    public static void main(String[] args) {
        System.out.println(minRemoveToMakeValid("lee(t(c)o)de)"));
        System.out.println(minRemoveToMakeValid("a)b(c) d"));
        System.out.println(minRemoveToMakeValid("(a(b(c)d"));
        System.out.println(minRemoveToMakeValid("())()((("));
        System.out.println(minRemoveToMakeValid("(a(b(c) d)"));
    }

    public static String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> invalidIndexes = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    invalidIndexes.add(i);
                }
            }
        }

        while (!stack.isEmpty()) {
            invalidIndexes.add(stack.pop());
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (!invalidIndexes.contains(i)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }


}
