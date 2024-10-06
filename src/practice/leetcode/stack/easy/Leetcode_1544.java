package practice.leetcode.stack.easy;

// Make The String Great
// https://leetcode.com/problems/make-the-string-great/description/

import java.util.Stack;

public class Leetcode_1544 {

    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
        System.out.println(makeGood("abBAcC"));
        System.out.println(makeGood("Pp"));
    }

    public static String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;

        while (i < s.length()){
            char c = s.charAt(i);

            if (!stack.empty() && stack.peek() == c){
                stack.add(c);
            }else if (!stack.empty() && Character.toUpperCase(stack.peek()) == c){
                stack.pop();
            }else if (!stack.empty() && Character.toLowerCase(stack.peek()) == c){
                stack.pop();
            }else {
                stack.add(c);
            }

            i++;
        }

        StringBuilder builder = new StringBuilder();

        for (char temp : stack){
            builder.append(temp);
        }

        return builder.toString();
    }

}
