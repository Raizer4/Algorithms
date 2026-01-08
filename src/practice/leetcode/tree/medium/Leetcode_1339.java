package practice.leetcode.tree.medium;

// Maximum Product of Splitted Binary Tree
// https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/description/?envType=daily-question&envId=2026-01-07

public class Leetcode_1339 {

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
        //   TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), new TreeNode(4, new TreeNode(5), new TreeNode(6))));

        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)
                ),
                new TreeNode(3,
                        new TreeNode(6),
                        null
                )
        );

        System.out.println(maxProduct(root));
    }

    private static long maxProduct = 0;
    private static final long MOD = 1_000_000_007;

    public static int maxProduct(TreeNode root) {
        long total = treeSum(root);
        findMaxProduct(root, total);

        return (int) (maxProduct % MOD);
    }

    private static long treeSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + treeSum(node.left) + treeSum(node.right);
    }

    private static long findMaxProduct(TreeNode node, long total) {
        if (node == null) return 0;

        long leftSum = findMaxProduct(node.left, total);
        long rightSum = findMaxProduct(node.right, total);

        long subtreeSum = node.val + leftSum + rightSum;
        long temp = subtreeSum * (total - subtreeSum);

        if (maxProduct < temp){
            maxProduct = temp;
        }

        return subtreeSum;
    }

}
