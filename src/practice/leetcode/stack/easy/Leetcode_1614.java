package practice.leetcode.stack.easy;

// Maximum Nesting Depth of the Parentheses
// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Leetcode_1614 {

    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
        System.out.println(maxDepth("()(())((()()))"));
    }

    public static int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.add(c);
            } else if (c == ')') {
                list.add(stack.size());
                stack.pop();
            }

            i++;
        }

        if (!list.isEmpty()) {
            return Collections.max(list);
        }{
            return 0;
        }
    }

}
