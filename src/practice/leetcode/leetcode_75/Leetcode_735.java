package practice.leetcode.leetcode_75;

// Asteroid Collision
// https://leetcode.com/problems/asteroid-collision/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Stack;

public class Leetcode_735 {

    public static void main(String[] args) {
        System.out.println(asteroidCollision(new int[]{5, 10, -5}));
        System.out.println(asteroidCollision(new int[]{8,-8}));
        System.out.println(asteroidCollision(new int[]{10,2,-5}));
        System.out.println(asteroidCollision(new int[]{-2,-1,1,2}));

    }

    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < asteroids.length; i++) {
            if (asteroids[i] > 0){
                stack.push(asteroids[i]);
            }else {
                int temp = asteroids[i];
                boolean flag = true;

                while (temp < 0 && !stack.empty()){
                    Integer pop = stack.pop();

                    if (pop < 0){
                        stack.push(pop);
                        stack.push(temp);
                        break;
                    }

                    Integer res = pop + temp;

                    if (res > 0){
                        temp = pop;
                        stack.push(pop);
                    }else if (res == 0){
                        flag = false;
                        break;
                    }
                }

                if (stack.empty() && flag){
                    stack.push(temp);
                }

            }

        }



        int[] array = new int[stack.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = stack.get(i);
        }

        return array;
    }


}
