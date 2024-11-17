package practice.leetcode.leetcode_75.decision.day_26.similar;

// Construct Smallest Number From DI String
// https://leetcode.com/problems/construct-smallest-number-from-di-string/description/

import java.util.*;

public class Leetcode_2375 {

    public static void main(String[] args) {
        System.out.println(smallestNumber("IIIDIDDD"));
    }

    public static String smallestNumber(String pattern) {
        StringBuilder result = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= pattern.length(); i++) {
            stack.push(i + 1);

            if (i == pattern.length() || pattern.charAt(i) == 'I') {
                while (!stack.isEmpty()) {
                    result.append(stack.pop());
                }
            }
        }

        return result.toString();
    }






}
