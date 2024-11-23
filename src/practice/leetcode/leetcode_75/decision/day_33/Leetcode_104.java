package practice.leetcode.leetcode_75.decision.day_33;

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

    public static int maxDepth(TreeNode root) {
      if (root == null){
          return 0;
      }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(right,left);
    }

}
