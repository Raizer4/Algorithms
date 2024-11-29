package practice.challenge.leetcode_75.decision.day_25.similar;

// Design a Stack With Increment Operation
// https://leetcode.com/problems/design-a-stack-with-increment-operation/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1381 {

    static class CustomStack {
        int max = 0;
        int count = 0;
        List<Integer> list = new ArrayList<>();

        public CustomStack(int maxSize) {
            max = maxSize;
        }

        public void push(int x) {
            if (count < max) {
                list.add(0, x);
                count++;
            }
        }

        public int pop() {
            if (count != 0){
                count--;
                return list.remove(0);
            }else {
                return -1;
            }
        }

        public void increment(int k, int val) {
            if (count >= k){
                int i = 0;
                int j = list.size() - 1;
                while (i < k){
                    list.set(j,list.get(j--) + val);
                    i++;
                }
            }else {
                for (int i = 0; i < count; i++){
                    list.set(i,list.get(i) + val);
                }
            }
        }

    }

    public static void main(String[] args) {
        CustomStack stk = new CustomStack(3);
        stk.push(1);
        stk.push(2);
        System.out.println(stk.pop()); // Вывод: 2
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.increment(5, 100);
        stk.increment(2, 100);
        System.out.println(stk.pop()); // Вывод: 103
        System.out.println(stk.pop()); // Вывод: 202
        System.out.println(stk.pop()); // Вывод: 201
        System.out.println(stk.pop());
    }

}
