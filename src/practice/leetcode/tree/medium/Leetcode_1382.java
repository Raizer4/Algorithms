package practice.leetcode.tree.medium;

// Balance a Binary Search Tree
// https://leetcode.com/problems/balance-a-binary-search-tree/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_1382 {

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
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        balanceBST(root);
    }

    public static TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);

        Collections.sort(list);

        return buildBalancedTree(list, 0, list.size() - 1);
    }

    private static void dfs(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }

        dfs(root.left, list);
        list.add(root.val);
        dfs(root.right, list);
    }

    private static TreeNode buildBalancedTree(List<Integer> list, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(list.get(mid));

        root.left = buildBalancedTree(list, start, mid - 1);
        root.right = buildBalancedTree(list, mid + 1, end);

        return root;
    }

}
