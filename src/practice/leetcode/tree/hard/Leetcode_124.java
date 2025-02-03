package practice.leetcode.tree.hard;

// Binary Tree Maximum Path Sum
// https://leetcode.com/problems/binary-tree-maximum-path-sum/description/

public class Leetcode_124 {

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

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(maxPathSum(root));
    }

    static int res = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    private static void dfs(TreeNode root){
        if (root == null) {return;}
        int left = getMax(root.left);
        int right = getMax(root.right);
        res = Math.max(res,root.val + left + right);
        dfs(root.left);
        dfs(root.right);
    }

    private static int getMax(TreeNode root){
        if (root == null){return 0;}
        int left = getMax(root.left);
        int right = getMax(root.right);
        int path = root.val + Math.max(left,right);
        return Math.max(0,path);
    }

}
