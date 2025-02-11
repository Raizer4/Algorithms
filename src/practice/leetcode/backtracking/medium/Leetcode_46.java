package practice.leetcode.backtracking.medium;

// Permutations
// https://leetcode.com/problems/permutations/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_46 {

    public static void main(String[] args) {
        permute(new int[]{1, 2, 3});
    }

    static private List<List<Integer>> res;

    public static List<List<Integer>> permute(int[] nums) {
        res = new ArrayList<>();
        dfs(new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private static void dfs(List<Integer> perm, int[] nums, boolean[] pick) {
        if (perm.size() == nums.length){
            res.add(new ArrayList<>(perm));
            return;
        }

        for (int i = 0; i < nums.length; i++){
            if (!pick[i]){
                perm.add(nums[i]);
                pick[i] = true;
                dfs(perm,nums,pick);
                perm.remove(perm.size() - 1);
                pick[i] = false;
            }
        }
    }

}
