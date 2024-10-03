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
       recursiya(root,list);
       return list;
    }

    private static void recursiya(TreeNode treeNode, List<Integer> list){
        if (treeNode == null){
            return;
        }
        recursiya(treeNode.left,list);
        list.add(treeNode.val);
        recursiya(treeNode.right,list);
    }

}
