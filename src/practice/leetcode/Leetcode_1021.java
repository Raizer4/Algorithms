package practice.leetcode;

// Remove Outermost Parentheses
// https://leetcode.com/problems/remove-outermost-parentheses/description/

import java.util.Stack;

public class Leetcode_1021 {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())"));
        System.out.println(removeOuterParentheses("()())(())(()(()))"));
        System.out.println(removeOuterParentheses("()()"));
    }

    public static String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        char close = ')';
        char open = '(';

        int count_o = 0;
        int count_c = 0;

        int t = 0;

        while (t < s.length() || !stack.isEmpty()){



            if (count_o == count_c && count_c != 0 && count_o != 0){
                for (int i = 1; i < stack.size() -1; i++){
                    builder.append(stack.get(i));
                }
                count_c = 0;
                count_o = 0;
                stack.clear();

                if (t >= s.length()){
                    break;
                }

            }

            char c = s.charAt(t);

             if (c == open){
                 stack.add('(');
                 count_o++;
             }else if (c == close){
                stack.add(')');
                count_c++;
             }

             t++;
        }


        return builder.toString();
    }

}
