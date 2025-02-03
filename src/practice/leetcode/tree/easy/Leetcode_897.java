package practice.leetcode.tree.easy;

// Increasing Order Search Tree
// https://leetcode.com/problems/increasing-order-search-tree/description/

import java.util.ArrayList;
import java.util.List;


public class Leetcode_897 {

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
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1, new TreeNode(0), new TreeNode(2));
        root.right = new TreeNode(4);
        System.out.println(increasingBST(root));
    }

    public static TreeNode increasingBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);

        TreeNode newRoot = new TreeNode(list.get(0));
        TreeNode current = newRoot;


        for (int i = 1; i < list.size(); i++) {
            current.right = new TreeNode(list.get(i));
            current = current.right;
        }

        return newRoot;
    }

    private static void dfs(TreeNode root, List<Integer> list){
        if (root == null){
            return;
        }

        dfs(root.left,list);

        list.add(root.val);

        dfs(root.right,list);
    }


}
