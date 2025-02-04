package practice.leetcode.backtracking.medium;

// Subsets
// https://leetcode.com/problems/subsets/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_78 {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        dfs(nums,0,subset, list);
        return list;
    }

    private static void dfs(int[] nums , int i , List<Integer> subset ,List<List<Integer>> list){
        if (i >= nums.length){
             list.add(new ArrayList<>(subset));
            return;
        }

        subset.add(nums[i]);
        dfs(nums, i + 1, subset, list);
        subset.remove(subset.size() - 1);
        dfs(nums, i + 1, subset, list);
    }

}
