package practice.leetcode.stack.medium;

// Evaluate Reverse Polish Notation
// https://leetcode.com/problems/evaluate-reverse-polish-notation/description/

import java.util.Stack;

public class Leetcode_150 {

    public static void main(String[] args) {
        String[] arr = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(arr));
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String temp : tokens){
            if (temp.equals("+")){
                Integer first = stack.pop();
                Integer second = stack.pop();
                stack.add(second + first);
            }else if (temp.equals("-")){
                Integer first = stack.pop();
                Integer second = stack.pop();
                stack.add(second - first);
            }else if (temp.equals("*")){
                Integer first = stack.pop();
                Integer second = stack.pop();
                stack.add(second * first);
            }else if (temp.equals("/")){
                Integer first = stack.pop();
                Integer second = stack.pop();
                stack.add(second / first);
            }else {
                stack.add(Integer.parseInt(temp));
            }
        }


        return stack.pop();
    }

}
