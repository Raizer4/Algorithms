package practice.leetcode.leetcode_75.decision.day_37.similar;

// Diameter of Binary Tree
// https://leetcode.com/problems/diameter-of-binary-tree/description/

public class Leetcode_543 {

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }

    static int max = 0;

    public static int diameterOfBinaryTree(TreeNode root) {
       dfs(root);
       return max;
    }

    private static void dfs(TreeNode root){
        if (root == null) {
            return;
        }

        max = Math.max(maxDepth(root.left) + maxDepth(root.right), max);

        dfs(root.left);
        dfs(root.right);
    }

    private static int maxDepth(TreeNode root){
        if (root == null){
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return 1 + Math.max(left,right);
    }


}
