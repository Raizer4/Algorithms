package practice.leetcode.backtracking.medium;

// Combination Sum
// https://leetcode.com/problems/combination-sum/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_39 {

    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2, 3, 6, 7} , 7));
    }

    static private List<List<Integer>> res;

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(candidates, 0, target, subset);
        return res;
    }

    private static void dfs(int[] candidates, int i, int target, List<Integer> subset){
        if (target == 0){
            res.add(new ArrayList<>(subset));
            return;
        }

        if (target < 0 || i >= candidates.length){
            return;
        }

        subset.add(candidates[i]);
        dfs(candidates, i, target - candidates[i], subset);
        subset.remove(subset.size() - 1);
        dfs(candidates, i + 1, target, subset);
    }

}
