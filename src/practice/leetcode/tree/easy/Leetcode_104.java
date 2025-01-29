package practice.leetcode.tree.easy;

// Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_104 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));
        System.out.println(maxDepth(root));
    }

    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }

    static int max = 0;

    public static int maxDepth(TreeNode root) {
        dfs(root,0);
        return max;
    }

    private static void dfs(TreeNode tree, int sum){
        if (tree == null){
            max = Math.max(max,sum);
            return;
        }

        dfs(tree.left, sum + 1);
        dfs(tree.right, sum + 1);
    }



}
