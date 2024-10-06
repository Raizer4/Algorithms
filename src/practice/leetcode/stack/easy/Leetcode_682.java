package practice.leetcode.stack.easy;

// Baseball Game
// https://leetcode.com/problems/baseball-game/description/

import java.util.Stack;

public class Leetcode_682 {

    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"}));
    }

    public static int calPoints(String[] operations) {
        int result = 0;

        Stack<Integer> stack = new Stack<>();

        for (String temp : operations){

            if (temp.equals("+")){
                if (stack.size() >= 2){
                    Integer pop = stack.pop();
                    Integer peek = stack.pop();
                    int i = pop + peek;
                    stack.add(peek);
                    stack.add(pop);
                    stack.add(i);
                }
            } else if (temp.equals("D")) {
                Integer pop = stack.peek();
                int i = pop * 2;
                stack.add(i);
            } else if (temp.equals("C")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                stack.add(Integer.parseInt(temp));
            }

        }

        for (Integer temp: stack){
            result += temp;
        }

        return result;
    }

}
