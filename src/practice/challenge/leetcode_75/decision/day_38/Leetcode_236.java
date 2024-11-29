package practice.challenge.leetcode_75.decision.day_38;

// Lowest Common Ancestor of a Binary Tree
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_236 {

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
        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        TreeNode p = root.left;
        TreeNode q = root.right;

        TreeNode lca = lowestCommonAncestor(root, p, q);
        System.out.println(lca.val);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root.val == p.val || root.val == q.val){
            return root;
        }

        TreeNode treeNode_1 = lowestCommonAncestor(root.left, p, q);
        TreeNode treeNode_2 = lowestCommonAncestor(root.right, p, q);


        if (treeNode_1 != null && treeNode_2 != null){
            return root;
        }

        if (treeNode_1 == null){
            return treeNode_2;
        }else {
            return treeNode_1;
        }

    }

}