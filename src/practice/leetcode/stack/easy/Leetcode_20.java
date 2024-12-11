package practice.leetcode.stack.easy;

// Valid Parentheses
// https://leetcode.com/problems/valid-parentheses/description/

import java.util.*;

public class Leetcode_20 {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');

        for (char temp : s.toCharArray()){
            if (temp == '(' || temp == '[' || temp == '{'){
                stack.add(temp);
            }else if (stack.isEmpty()){
                return false;
            }else {
                if (map.get(stack.pop()) != temp){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

}
