package practice.leetcode.design.medium;

// Daily Temperatures
// https://leetcode.com/problems/daily-temperatures/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Stack;

public class Leetcode_901 {

    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
        System.out.println(stockSpanner.next(28));
        System.out.println(stockSpanner.next(14));
        System.out.println(stockSpanner.next(28));
        System.out.println(stockSpanner.next(35));
        System.out.println(stockSpanner.next(46));
        System.out.println(stockSpanner.next(53));
        System.out.println(stockSpanner.next(66));
        System.out.println(stockSpanner.next(80));
        System.out.println(stockSpanner.next(87));
        System.out.println(stockSpanner.next(88));
    }

    static class StockSpanner {
        Stack<int[]> stack;

        public StockSpanner() {
            stack = new Stack<>();
        }

        public int next(int price) {
            int res = 1;

            while (!stack.isEmpty() && stack.peek()[0] <= price ){
                res += stack.pop()[1];
            }

            stack.push(new int[]{price, res});
            return res;
        }
    }

}
