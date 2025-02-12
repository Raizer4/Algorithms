package practice.leetcode.backtracking.medium;

// Palindrome Partitioning
// https://leetcode.com/problems/palindrome-partitioning/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_131 {

    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> part = new ArrayList<>();
        dfs(0, s, part, res);
        return res;
    }

    private static void dfs(int i, String s, List<String> part, List<List<String>> res){
        if (i >= s.length()){
            res.add(new ArrayList<>(part));
            return;
        }

        for (int j = i; j < s.length(); j++){
            if (isPail(s,i,j)){
                part.add(s.substring(i, j + 1));
                dfs(j + 1, s, part,res);
                part.remove(part.size() - 1);
            }
        }
    }


    private static boolean isPail(String s, int l, int r){
        while (l < r){
            if (s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

}
