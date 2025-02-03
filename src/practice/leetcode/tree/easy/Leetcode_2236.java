package practice.leetcode.tree.easy;

// Root Equals Sum of Children
// https://leetcode.com/problems/root-equals-sum-of-children/description/

public class Leetcode_2236 {

    static public class TreeNode {
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
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(4);
        treeNode.right = new TreeNode(6);
        checkTree(treeNode);
    }

    public static boolean checkTree(TreeNode root) {
        return root.val == (root.left.val + root.right.val);
    }

}
