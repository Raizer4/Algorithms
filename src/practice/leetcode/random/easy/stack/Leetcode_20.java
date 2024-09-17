package practice.leetcode.random.easy.stack;

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

        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        char[] array = s.toCharArray();

        for (char temp : array){
            if (map.containsValue(temp)){
                stack.push(temp);
            }else if (stack.empty()){
                return false;
            }else if(map.containsKey(temp)) {
                if (map.get(temp) != stack.pop()){
                    return false;
                }
            }
        }

        if (stack.size() == 0){
            return true;
        }else {
            return false;
        }

    }

}
