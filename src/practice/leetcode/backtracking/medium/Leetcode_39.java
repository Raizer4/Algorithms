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

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        dfs(nums,target,cur, 0);
        return res;
    }

    private static void dfs(int[] nums, int target, List<Integer> cur, int i) {
        if (target == 0){
            res.add(new ArrayList<>(cur));
            return;
        }

        if (target < 0 || i >= nums.length){
            return;
        }

        cur.add(nums[i]);
        dfs(nums, target - nums[i], cur,i);
        cur.remove(cur.size() - 1);
        dfs(nums, target, cur, i + 1);
    }

}
