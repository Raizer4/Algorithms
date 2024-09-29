package practice.leetcode.leetcode_75;

// Longest ZigZag Path in a Binary Tree
// https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1372 {

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
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.left.right = new TreeNode(1);
        root.right.left.left = new TreeNode(1);
        root.right.left.right.right = new TreeNode(1);

        System.out.println(longestZigZag(root));
    }

    private static int maxZigZagLength = 0;

    public static int longestZigZag(TreeNode root) {
        if (root == null){
            return 0;
        }

        dfs(root.left,1,true);
        dfs(root.right,1,false);

        return maxZigZagLength;
    }

    private static void dfs(TreeNode node, int length, boolean isLeft){
        if (node == null) return;

        maxZigZagLength = Math.max(maxZigZagLength, length);

        if (isLeft) {
            dfs(node.left, 1, true);
            dfs(node.right, length + 1, false);
        } else {
            dfs(node.right, 1, false);
            dfs(node.left, length + 1, true);
        }

    }

}
