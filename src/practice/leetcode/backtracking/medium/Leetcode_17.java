package practice.leetcode.backtracking.medium;

// Letter Combinations of a Phone Number
// https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_17 {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    private static List<String> res = new ArrayList<>();
    private static String[] arr = new String[]{
       "", "" , "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };


    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return res;
        dfs(0, "", digits);
        return res;
    }

    private static void dfs(int i, String curStr, String digits){
        if (curStr.length() == digits.length()){
            res.add(curStr);
            return;
        }

        String s = arr[digits.charAt(i) - '0'];

        for (char c : s.toCharArray()){
            dfs(i + 1, curStr + c, digits);
        }
    }

}
