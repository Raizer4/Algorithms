package practice.challenge.leetcode_75.decision.day_33.similar;

// Binary Tree Preorder Traversal
// https://leetcode.com/problems/binary-tree-preorder-traversal/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_144 {

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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1, new TreeNode(0), new TreeNode(2));
        root.right = new TreeNode(4);

        System.out.println(preorderTraversal(root));
    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = preDFS(root);
        Collections.sort(list);
        return list;
    }

    private static List<Integer> preDFS(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);
        return list;
    }

    private static void dfs(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }

        list.add(root.val);

        dfs(root.left,list);
        dfs(root.right,list);
    }

}
