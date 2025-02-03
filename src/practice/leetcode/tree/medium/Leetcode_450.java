package practice.leetcode.tree.medium;

// Delete Node in a BST
// https://leetcode.com/problems/delete-node-in-a-bst/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_450 {

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
        TreeNode root = new TreeNode(50);

        root.left = new TreeNode(30);
        root.right = new TreeNode(70);

        root.left.right = new TreeNode(40);

        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(80);

        deleteNode(root, 50);
    }

    public static TreeNode deleteNode(TreeNode root, int key) {
        if (root == null){
            return null;
        }

        if (root.val == key){

            if (root.left == null && root.right == null){
                root = null;
            } else if (root.left == null && root.right != null) {
                root = root.right;
            }else if (root.left != null && root.right == null){
                root = root.left;
            }else {
                TreeNode treeNode = maxDepth(root.right);
                deleteNode(root,treeNode.val);
                root.val = treeNode.val;
            }

            return root;
        }

        root.left = deleteNode(root.left, key);
        root.right = deleteNode(root.right, key);

        return root;
    }

    private static TreeNode maxDepth(TreeNode root){
        if (root.left == null){
            return root;
        }
        return maxDepth(root.left);
    }




}
