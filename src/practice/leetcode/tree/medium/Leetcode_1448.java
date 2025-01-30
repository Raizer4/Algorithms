package practice.leetcode.tree.medium;

// Count Good Nodes in Binary Tree
// https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_1448 {

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
        TreeNode root = new TreeNode(3,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5))
        );
        System.out.println(goodNodes(root));
    }

    static int count = 0;

    public static int goodNodes(TreeNode root) {
        dfs(root, root.val);
        return count;
    }

    private static void dfs(TreeNode node, int max){
        if (node == null){
            return;
        }

        if (node.val >= max){
            count++;
            dfs(node.left, node.val);
            dfs(node.right, node.val);
        }else {
            dfs(node.left, max);
            dfs(node.right, max);
        }

    }

}





