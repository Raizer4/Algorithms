package practice.challenge.leetcode_75.decision.day_24.similar;

// Reverse Substrings Between Each Pair of Parentheses
// https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1190 {

    public static void main(String[] args) {
        System.out.println(reverseParentheses("apmnolkjihgfedcbq"));
        System.out.println(reverseParentheses("(abcd)"));
        System.out.println(reverseParentheses("(ed(et(oc))el)"));
        System.out.println(reverseParentheses("a(bcdefghijkl(mno)p)q"));
    }

    public static String reverseParentheses(String s) {
        StringBuilder builder = new StringBuilder();
        int i = 0;

        while (i < s.length()){
            if (s.charAt(i) == '('){
                List reverse = reverse(s, i + 1);
                builder.append(reverse.get(0));
                i = (int) reverse.get(1);
            }else {
                builder.append(s.charAt(i++));
            }
        }

        return builder.toString();
    }

    private static List reverse(String s, int i){
        StringBuilder builder = new StringBuilder();

        while (i < s.length()){
            if (s.charAt(i) == '('){
                List reverse = reverse(s, i + 1);
                builder.append(reverse.get(0));
                i = (int) reverse.get(1);
            }else if (s.charAt(i) == ')'){
                List list = new ArrayList();
                list.add(builder.reverse().toString());
                list.add(i + 1);
                return list;
            }else {
                builder.append(s.charAt(i++));
            }
        }

        return new ArrayList();
    }

}
