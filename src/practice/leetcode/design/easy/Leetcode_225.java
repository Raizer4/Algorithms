package practice.leetcode.design.easy;

// Implement Stack using Queues
// https://leetcode.com/problems/implement-stack-using-queues/description/

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_225 {

    static class MyStack {
        private Queue<Integer> queue1;
        private Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
           queue2.add(x);

           while (!queue1.isEmpty()){
               queue2.add(queue1.remove());
           }

           Queue temp = queue1;
           queue1 = queue2;
           queue2 = temp;
        }

        public int pop() {
            return queue1.remove();
        }

        public int top() {
            return queue1.peek();
        }

        public boolean empty() {
            return queue1.isEmpty();
        }

    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.top();
        myStack.pop();
        myStack.empty();
    }

}
