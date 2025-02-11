package practice.leetcode.backtracking.medium;

// Combination Sum II
// https://leetcode.com/problems/combination-sum-ii/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_40 {

    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[]{1, 1, 2, 5, 6, 7, 10}, 8));
    }

    static List<List<Integer>> res;

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        List<Integer> sublist = new ArrayList<>();
        dfs(candidates,0,target,0,sublist);
        return res;
    }

    private static void dfs(int[] candidates, int i, int target, int count, List<Integer> sublist ){
        if (count == target){
            res.add(new ArrayList<>(sublist));
            return;
        }

        if (count > target || i >= candidates.length){
            return;
        }

        sublist.add(candidates[i]);
        dfs(candidates, i + 1, target, count + candidates[i], sublist);
        sublist.remove(sublist.size() - 1);

        while (i + 1 < candidates.length && candidates[i] == candidates[i+1]){
            i++;
        }

        dfs(candidates, i + 1, target, count, sublist);
    }

}
