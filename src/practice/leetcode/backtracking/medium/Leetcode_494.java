package practice.leetcode.backtracking.medium;

// Target Sum
// https://leetcode.com/problems/target-sum/description/

public class Leetcode_494 {

    public static void main(String[] args) {
        System.out.println(findTargetSumWays(new int[]{1,1,1,1,1}, 3));
    }

    public static int findTargetSumWays(int[] nums, int target) {
        return dfs(0, 0, nums, target);
    }

    public static int dfs(int i, int total, int[] nums, int target){
        if (i == nums.length){
            return total == target ? 1 : 0;
        }

        return dfs(i + 1, total + nums[i], nums, target) + dfs(i + 1, total - nums[i], nums, target);
    }

}
