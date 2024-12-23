package practice.leetcode.stack.medium;

// Car Fleet
// https://leetcode.com/problems/car-fleet/description/

import java.util.Arrays;
import java.util.Stack;

public class Leetcode_853 {

    public static void main(String[] args) {
        System.out.println(carFleet(12, new int[]{10,8,0,5,3}, new int[]{2,4,1,1,3} ));
    }

    public static int carFleet(int target, int[] position, int[] speed) {
        double[][] arr = new double[position.length][2];

        for (int i = 0; i < position.length; i++){
            arr[i][0] = position[i];
            arr[i][1] = speed[i];
        }

        Arrays.sort(arr,(a,b) -> Double.compare(b[0], a[0]));

        Stack<Double> stack = new Stack<>();

        for (double[] temp : arr){
            stack.push((target - temp[0]) / temp[1]);
            if (stack.size() >= 2 && stack.peek() <= stack.get(stack.size() - 2)){
                stack.pop();
            }
        }

        return stack.size();
    }


}
