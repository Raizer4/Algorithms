package practice.leetcode.stack.medium;

// Asteroid Collision
// https://leetcode.com/problems/asteroid-collision/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Stack;

public class Leetcode_735 {

    public static void main(String[] args) {
          System.out.println(asteroidCollision(new int[]{5, 10, -5}));
          System.out.println(asteroidCollision(new int[]{8,-8}));
          System.out.println(asteroidCollision(new int[]{10,2,-5}));
        int[] ints = asteroidCollision(new int[]{1,-1,-2,-2});

        for (int temp : ints){
            System.out.println(temp);
        }

    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        stack.add(asteroids[0]);

        for (int i = 1; i < asteroids.length; i++){
            int asteroid = asteroids[i];

            if (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0 && Math.abs(stack.peek()) == Math.abs(asteroid)) {
                stack.pop();
            } else if (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {

                while (!stack.isEmpty() && stack.peek() > 0 &&  Math.abs(stack.peek()) < Math.abs(asteroid)){
                    stack.pop();
                }

                if (stack.isEmpty()){
                    stack.add(asteroid);
                } else if (stack.peek() < 0) {
                    stack.add(asteroid);
                }else if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    stack.pop();
                }

            }else {
                stack.add(asteroid);
            }

        }

        int[] res = new int[stack.size()];
        int i = 0;

        for (Integer temp: stack){
            res[i++] = temp;
        }

        return res;
    }


}
