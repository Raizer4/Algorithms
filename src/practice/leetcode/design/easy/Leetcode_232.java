package practice.leetcode.design.easy;

// Implement Queue using Stacks
// https://leetcode.com/problems/implement-queue-using-stacks/description/

import java.util.Stack;

public class Leetcode_232 {

   static class MyQueue {
      Stack<Integer> stack_1;
      Stack<Integer> stack_2;
      public MyQueue() {
         stack_1 = new Stack<>();
         stack_2 = new Stack<>();
      }

      public void push(int x) {
         stack_1.push(x);
      }

      public int pop() {
         if (stack_2.isEmpty()){
            while (!stack_1.isEmpty()){
               stack_2.push(stack_1.pop());
            }
         }
         return stack_2.pop();
      }

      public int peek() {
         if (stack_2.isEmpty()){
            while (!stack_1.isEmpty()){
               stack_2.push(stack_1.pop());
            }
         }
         return stack_2.peek();
      }

      public boolean empty() {
         return stack_2.isEmpty() && stack_1.isEmpty();
      }

   }

   public static void main(String[] args) {
      MyQueue myQueue = new MyQueue();

      myQueue.push(1);
      myQueue.push(2);
      myQueue.peek();
      myQueue.pop();
      myQueue.empty();
   }

}
