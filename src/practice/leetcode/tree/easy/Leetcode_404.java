package practice.leetcode.tree.easy;

// Sum of Left Leaves
// https://leetcode.com/problems/sum-of-left-leaves/description/

public class Leetcode_404 {

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
        System.out.println(sumOfLeftLeaves(new TreeNode(3, new TreeNode(9),new TreeNode(20,new TreeNode(15), new TreeNode(7)))));
    }

    public static int sumOfLeftLeaves(TreeNode root) {
        return dfs(root,false);
    }

    private static int dfs(TreeNode root, boolean isLeft){
        if (root == null){
            return 0;
        }


        if (root.left == null && root.right == null){
            if (isLeft){
                return root.val;
            }
        }

        return dfs(root.left,true) + dfs(root.right,false);
    }



}
