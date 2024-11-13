package practice.leetcode.leetcode_75.decision.day_24.similar;

// Minimum Add to Make Parentheses Valid
// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/description/

import java.util.Stack;

public class Leetcode_921 {

    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
        System.out.println(minAddToMakeValid("((("));
    }

    public static int minAddToMakeValid(String s) {
        int count = 0;
        Stack<Character> stack = new Stack<>();

        for (char temp : s.toCharArray()){
            if (temp == '('){
                stack.add('(');
            }else if (temp == ')' && !stack.isEmpty()){
                stack.pop();
            }else if (temp == ')' && stack.isEmpty()){
                count++;
            }
        }

        return count+ stack.size();
    }

}
