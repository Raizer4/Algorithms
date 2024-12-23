package practice.leetcode.stack.hard;

// Largest Rectangle in Histogram
// https://leetcode.com/problems/largest-rectangle-in-histogram/description/

import java.util.Stack;

public class Leetcode_84 {

    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
    
    public static int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();

        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            int[] arr = new int[]{i, heights[i]};
            while (!stack.isEmpty() && stack.peek()[1] > heights[i]){
                int[] pop = stack.pop();
                int temp = (i - pop[0]) * pop[1];
                max = Integer.max(temp, max);
                arr[0] = pop[0];
            }
            stack.push(arr);
        }

        for (int[] temp : stack){
            max = Math.max(max,((heights.length - temp[0]) * temp[1]));
        }

        return max;
    }
    
}
