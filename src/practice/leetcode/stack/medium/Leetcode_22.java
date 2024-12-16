package practice.leetcode.stack.medium;

// Generate Parentheses
// https://leetcode.com/problems/generate-parentheses/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_22 {

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    public static boolean valid(String s) {
        int open = 0;
        for (char c : s.toCharArray()) {
            open += c == '(' ? 1 : -1;
            if (open < 0) return false;
        }
        return open == 0;
    }

    static void dfs(String s, List<String> res, int n) {
        if (n * 2 == s.length()) {
            if (valid(s)) res.add(s);
            return;
        }
        dfs(s + '(', res, n);
        dfs(s + ')', res, n);
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs("", res, n);
        return res;
    }

}
