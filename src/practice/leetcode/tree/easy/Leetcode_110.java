package practice.leetcode.tree.easy;

// Balanced Binary Tree
// https://leetcode.com/problems/balanced-binary-tree/description/?envType=problem-list-v2&envId=depth-first-search&difficulty=EASY

public class Leetcode_110 {

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
        System.out.println(isBalanced(new TreeNode(1,new TreeNode(9),new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        System.out.println(isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2))));
    }

    public static boolean isBalanced(TreeNode root) {
        dfs(root);
        return flag;
    }

    static boolean flag = true;

    private static int dfs(TreeNode root){
        if (root == null){
            return 0;
        }

        int left = dfs(root.left);
        int right = dfs(root.right);

        if (Math.abs(left - right) > 1){
            flag = false;
        }

        return 1 + Math.max(left,right);
    }

}
