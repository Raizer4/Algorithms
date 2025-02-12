package practice.leetcode.backtracking.medium;

// Permutations
// https://leetcode.com/problems/permutations/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_46 {

    public static void main(String[] args) {
        permute(new int[]{1, 2, 3});
    }

    private static List<List<Integer>> res;

    public static List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        dfs(nums,0);
        return res;
    }

    public static void dfs(int[] nums, int idx){
        if (nums.length == idx){
            List<Integer> perm = new ArrayList<>();
            for (int num:nums)perm.add(num);
            res.add(perm);
            return;
        }

        for (int i = idx; i < nums.length; i++){
            swap(nums, idx, i);
            dfs(nums, idx + 1);
            swap(nums, idx, i);
        }
    }

    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
