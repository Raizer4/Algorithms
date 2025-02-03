package practice.leetcode.tree.medium;

// Longest ZigZag Path in a Binary Tree
// https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_1372 {

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
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        root.right.left.right = new TreeNode(1);
        root.right.left.left = new TreeNode(1);
        root.right.left.right.right = new TreeNode(1);

        System.out.println(longestZigZag(root));
    }

    static int count = 0;

    public static int longestZigZag(TreeNode root) {
        countingZigZag(root.left, 1, true);
        countingZigZag(root.right, 1, false);
        return count;
    }

    private static void countingZigZag(TreeNode node,int sum,boolean isLeft){
        if (node == null){
            return;
        }

        count = Math.max(count,sum);

        if (isLeft){
            countingZigZag(node.left, 1, isLeft);
            countingZigZag(node.right, sum + 1, !isLeft);
        }else {
            countingZigZag(node.right, 1, isLeft);
            countingZigZag(node.left, sum + 1, !isLeft);
        }

    }

}
