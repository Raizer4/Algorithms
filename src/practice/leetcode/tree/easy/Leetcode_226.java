package practice.leetcode.tree.easy;

// Invert Binary Tree
// https://leetcode.com/problems/invert-binary-tree/description/

public class Leetcode_226 {

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
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        root.right = new TreeNode(7, new TreeNode(6), new TreeNode(9));

        TreeNode invertedRoot = invertTree(root);
    }

    public static TreeNode invertTree(TreeNode root) {
       if (root == null){
            return null;
       }

       TreeNode temp = new TreeNode();
       temp = root.left;
       root.left = root.right;
       root.right = temp;

       invertTree(root.left);
       invertTree(root.right);

       return root;
    }

}
