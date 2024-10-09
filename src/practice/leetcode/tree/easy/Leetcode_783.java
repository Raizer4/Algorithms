package practice.leetcode.tree.easy;

// Minimum Distance Between BST Nodes
// https://leetcode.com/problems/minimum-distance-between-bst-nodes/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_783 {

    static class TreeNode {
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
        System.out.println(minDiffInBST(new TreeNode(4,new TreeNode(2, new TreeNode(1),new TreeNode(3)), new TreeNode(6))));
    }

    public static int minDiffInBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);

            for (int j = i + 1; j < list.size(); j++) {
              result.add(Math.abs(integer - list.get(j)));
            }

        }

        return Collections.min(result);
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
