package practice.leetcode.tree.medium;

// Binary Search Tree to Greater Sum Tree
// https://leetcode.com/problems/binary-search-tree-to-greater-sum-tree/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1038 {

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
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        root.left.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(8);

        bstToGst(root);
    }

    public static TreeNode bstToGst(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        merge(root,list);
        return root;
    }

    private static void merge(TreeNode treeNode , List<Integer> list){
        if (treeNode == null){return;}

        treeNode.val = maxim(list,treeNode.val);

        merge(treeNode.left,list);
        merge(treeNode.right,list);
    }

    private static int maxim(List<Integer> list, Integer var){
        int res = 0;

        for (Integer integer : list){
            if (integer >= var){
                res += integer;
            }
        }

        return res;
    }

    private static void dfs(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }

        list.add(root.val);

        dfs(root.left, list);
        dfs(root.right, list);
    }

}
