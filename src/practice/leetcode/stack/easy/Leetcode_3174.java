package practice.leetcode.stack.easy;

// Clear Digits
// https://leetcode.com/problems/clear-digits/description/


import java.util.Stack;

public class Leetcode_3174 {

    public static void main(String[] args) {
        System.out.println(clearDigits("cb34"));
        System.out.println(clearDigits("abc"));
    }

    public static String clearDigits(String s) {
        Stack<Character> stack = new Stack<>();

        for (char temp : s.toCharArray()){
            if (Character.isDigit(temp)){
                stack.pop();
            }else {
                stack.add(temp);
            }
        }

        StringBuilder builder = new StringBuilder();

        for (char temp : stack){
            builder.append(temp);
        }

        return builder.toString();
    }

}
