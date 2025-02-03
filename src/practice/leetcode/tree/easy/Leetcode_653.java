package practice.leetcode.tree.easy;

// Two Sum IV - Input is a BST
// https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/

import java.util.*;

public class Leetcode_653 {

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
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        System.out.println(findTarget(root, 9));
    }

    public static boolean findTarget(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        dfs(root, list);

        Set<Integer> set = new HashSet<>();

        for (Integer temp : list) {
            if (set.contains(k - temp)) {
                return true;
            }
            set.add(temp);
        }

        return false;
    }

    public static void dfs(TreeNode treeNode, List<Integer> list){
        if (treeNode == null){
            return;
        }

        list.add(treeNode.val);
        dfs(treeNode.left, list);
        dfs(treeNode.right, list);
    }

}
