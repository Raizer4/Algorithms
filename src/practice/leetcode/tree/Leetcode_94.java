package practice.leetcode.tree;

// Binary Tree Inorder Traversal
// https://leetcode.com/problems/binary-tree-inorder-traversal/description/?envType=problem-list-v2&envId=tree&difficulty=EASY



import java.util.ArrayList;
import java.util.List;

public class Leetcode_94 {

    static class TreeNode {
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
        List<Integer> integers = inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null)));
        System.out.println(integers);
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
    }

    private static void inorder(TreeNode node, List<Integer> res){
        if (node == null){
            return;
        }
        inorder(node.left,res);
        res.add(node.val);
        inorder(node.right,res);
    }

}
