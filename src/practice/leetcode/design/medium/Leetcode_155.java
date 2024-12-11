package practice.leetcode.design.medium;

import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class Leetcode_155 {

    static class MinStack {

        Stack<Integer> stack;
        Stack<Integer> stack_min;

        public MinStack() {
            stack = new Stack<>();
            stack_min = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (stack_min.isEmpty() || val <= stack_min.peek()) {
                stack_min.push(val);
            }
        }

        public void pop() {
            if (stack.isEmpty()) return;
            int top = stack.pop();
            if (top == stack_min.peek()) {
                stack_min.pop();
            }
        }

        public int top() {
            if (!stack.isEmpty()) {
                return stack.peek();
            }
            return -1;
        }

        public int getMin() {
            if (!stack_min.isEmpty()) {
                return stack_min.peek();
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }



}
