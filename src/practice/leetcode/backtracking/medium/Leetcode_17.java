package practice.leetcode.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_17 {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    private static List<String> res = new ArrayList<>();

    private static String[] digitToChar = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "qprs", "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {
        if (digits.isBlank()) return res;
        dfs(0, "", digits);
        return res;
    }

    private static void dfs(int i, String curStr, String digits){
        if (curStr.length() == digits.length()){
            res.add(curStr);
            return;
        }
        String chars = digitToChar[digits.charAt(i) - '0'];

        for (char c : chars.toCharArray()){
            dfs(i + 1, curStr + c, digits);
        }
    }

}
