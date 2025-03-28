package practice.leetcode.tree.easy;

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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        int diameter = diameterOfBinaryTree(root);
        System.out.println("Диаметр дерева: " + diameter);
    }

    public static int diameterOfBinaryTree(TreeNode root) {
        int[] res = new int[]{0};
        dfs(root,res);
        return res[0];
    }

    private static int dfs(TreeNode root, int[] res) {
        if (root == null){
            return 0;
        }

        int left = dfs(root.left, res);
        int right = dfs(root.right,res);
        res[0] = Math.max(res[0], left + right);
        return 1 + Math.max(left,right);
    }

}
