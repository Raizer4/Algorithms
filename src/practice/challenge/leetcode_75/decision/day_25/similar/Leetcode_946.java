package practice.challenge.leetcode_75.decision.day_25.similar;

// Validate Stack Sequences
// https://leetcode.com/problems/validate-stack-sequences/description/

import java.util.Stack;

public class Leetcode_946 {

    public static void main(String[] args) {
        System.out.println(validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,5,3,2,1}));
        System.out.println(validateStackSequences(new int[]{1,2,3,4,5}, new int[]{4,3,5,1,2}));
    }


    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int x : pushed) {
            stack.push(x);

            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }


        return stack.isEmpty();
    }

}
