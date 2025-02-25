package practice.leetcode.backtracking.medium;

// Combination Sum III
// https://leetcode.com/problems/combination-sum-iii/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;

public class Leetcode_216 {

    public static void main(String[] args) {
        System.out.println(combinationSum3(3,7));
    }

    private static List<List<Integer>> res = new ArrayList<>();

    public static List<List<Integer>> combinationSum3(int k, int n) {
        dfs(1, 0, new ArrayList<>(), k, n);
        return res;
    }

    private static void dfs(int idx, int sum, List<Integer> list , int k, int n){
        if (sum == n && list.size() == k){
            res.add(new ArrayList<>(list));
            return;
        }

        if (sum > n || list.size() >= k){
            return;
        }

        for (int i = idx; i <= 9; i++){
            list.add(i);
            dfs(i + 1, sum + i, list, k, n );
            list.remove(list.size() - 1);
        }

    }

}
