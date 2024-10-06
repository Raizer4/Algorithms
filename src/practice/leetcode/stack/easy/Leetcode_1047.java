package practice.leetcode.stack.easy;

// Remove All Adjacent Duplicates In String
// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/


import java.util.Stack;

public class Leetcode_1047 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char temp : s.toCharArray()){

            if (!stack.empty() && stack.peek() == temp){
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
