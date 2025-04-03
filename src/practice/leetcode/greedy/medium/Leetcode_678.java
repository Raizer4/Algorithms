package practice.leetcode.greedy.medium;

// Valid Parenthesis String
// https://leetcode.com/problems/valid-parenthesis-string/description/

public class Leetcode_678 {

    public static void main(String[] args) {
        System.out.println(checkValidString("()"));
        System.out.println(checkValidString("(*)"));
        System.out.println(checkValidString("(*))"));
        System.out.println(checkValidString("(*)((*)"));
    }

    public static boolean checkValidString(String s) {
        int min = 0;
        int max = 0;

        for (char c : s.toCharArray()){
            if (c == '('){
                min++;
                max++;
            } else if (c == ')') {
                min = Math.max(min - 1, 0);
                max--;

                if (max < 0){return false;}
            }else {
               min = Math.max(min - 1, 0);
               max++;
            }

        }

        return min == 0;
    }

}
