package practice.leetcode.tree.easy;

// Evaluate Boolean Binary Tree
// https://leetcode.com/problems/evaluate-boolean-binary-tree/description/

public class Leetcode_2331 {

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
        System.out.println(evaluateTree(new TreeNode(3,new TreeNode(1), new TreeNode(1))));
    }

    public static boolean evaluateTree(TreeNode root) {
        if (root.val == 1){
            return true;
        }

        if (root.val == 0){
            return false;
        }

        if (root.val == 2){
            return (evaluateTree(root.left)  || evaluateTree(root.right));
        } else if (root.val == 3) {
            return (evaluateTree(root.left) && evaluateTree(root.right));
        }

        return false;
    }

}
