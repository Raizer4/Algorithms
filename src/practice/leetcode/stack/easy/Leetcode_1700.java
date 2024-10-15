package practice.leetcode.stack.easy;

// Number of Students Unable to Eat Lunch
// https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/description/

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Leetcode_1700 {

    public static void main(String[] args) {
        System.out.println(countStudents(new int[]{1,1,0,0},new int[]{0,1,0,1}));
        System.out.println(countStudents(new int[]{1,1,1,0,0,1},new int[]{1,0,0,0,1,1}));
    }


    public static int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> st_stack = new LinkedList<>();
        Stack<Integer> san_stack = new Stack<>();

        for (int i = 0; i < students.length; i++){
            st_stack.add(students[i]);
        }

        for (int i = sandwiches.length -1; i >= 0; i--) {
            san_stack.add(sandwiches[i]);
        }

        int i = 0;

        while (i < students.length ){
            Integer pop = st_stack.poll();

            if (pop == san_stack.peek()){
                san_stack.pop();
                i = 0;
            }else {
                st_stack.add(pop);
            }

            if (st_stack.isEmpty()){
                break;
            }

            i++;
        }

        return st_stack.size();
    }

}
