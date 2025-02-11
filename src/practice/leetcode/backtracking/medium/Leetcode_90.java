package practice.leetcode.backtracking.medium;

// Subsets II
// https://leetcode.com/problems/subsets-ii/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_90 {

    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1,2,2}));
    }

    private static List<List<Integer>> res;

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums,0, new ArrayList<>());
        return res;
    }

    private static void dfs(int[] nums, int i, List<Integer> sublist){
        if (i >= nums.length){
            res.add(new ArrayList<>(sublist));
            return;
        }

        sublist.add(nums[i]);
        dfs(nums, i + 1, sublist);
        sublist.remove(sublist.size() - 1);

        while (i + 1 < nums.length && nums[i] == nums[i + 1]){
            i++;
        }

        dfs(nums, i + 1, sublist);
    }

}
