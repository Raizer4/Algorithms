package practice.leetcode.stack.medium;

// Daily Temperatures
// https://leetcode.com/problems/daily-temperatures/description/

import java.util.Stack;

public class Leetcode_739 {

    public static void main(String[] args) {
        int[] ints = dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});

        for (int temp : ints){
            System.out.println(temp);
        }
    }

    public static int[] dailyTemperatures(int[] temperatures) {
       Stack<int[]> stack = new Stack();

       int[] res = new int[temperatures.length];

       for (int i = 0; i < temperatures.length; i++){
           while (!stack.isEmpty() &&  stack.peek()[0] < temperatures[i]){
               int[] pop = stack.pop();
               res[pop[1]] = i - pop[1];
           }
           stack.push(new int[]{temperatures[i], i});
       }


       return res;
    }

}
