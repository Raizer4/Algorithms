package practice.leetcode.tree.easy;

// Binary Tree Inorder Traversal
// https://leetcode.com/problems/binary-tree-inorder-traversal/description/?envType=problem-list-v2&envId=tree&difficulty=EASY



import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
        List<Integer> list = new ArrayList<>();
        inorderRec(root,list);
        return list;
    }

    private static void inorderRec(TreeNode root, List<Integer> list){
        if (root != null){
            inorderRec(root.left,list);
            list.add(root.val);
            inorderRec(root.right,list);
        }
    }


}
