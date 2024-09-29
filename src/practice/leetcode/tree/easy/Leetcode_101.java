package practice.leetcode.tree.easy;

public class Leetcode_101 {

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
        System.out.println(isSymmetric(new TreeNode(1,new TreeNode(2,new TreeNode(3),new TreeNode(4)),new TreeNode(2, new TreeNode(4),new TreeNode(3)))));
    }

    public static boolean isSymmetric(TreeNode root) {
       return isMirror(root.left,root.right);
    }

    public static boolean isMirror(TreeNode n1, TreeNode n2){
      if (n1 == null || n2 == null){
          return n1 == n2;
      }

      return n1.val == n2.val && isMirror(n1.left,n2.right) && isMirror(n1.right,n2.left);
    }

}
