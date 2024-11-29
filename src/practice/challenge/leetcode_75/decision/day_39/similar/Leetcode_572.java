package practice.challenge.leetcode_75.decision.day_39.similar;

// Subtree of Another Tree
// https://leetcode.com/problems/subtree-of-another-tree/description/

public class Leetcode_572 {

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
        TreeNode root = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(2)),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(4, new TreeNode(1), new TreeNode(2));

        System.out.println(isSubtree(root, subRoot));
    }


    public static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null){
            return false;
        }

        if (dfs(root, subRoot)) {
            return true;
        }

       return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean dfs(TreeNode root, TreeNode subRoot){
        if (root == null && subRoot == null){
            return true;
        }

        if (root == null || subRoot == null){
            return false;
        }

        if (root.val != subRoot.val){
            return false;
        }


        return dfs(root.left, subRoot.left) && dfs(root.right, subRoot.right);
    }

}

