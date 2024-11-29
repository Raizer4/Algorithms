package practice.challenge.leetcode_75.decision.day_38.similar;

// Minimum Absolute Difference in BST
// https://leetcode.com/problems/minimum-absolute-difference-in-bst/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_530 {

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

        System.out.println(getMinimumDifference(root));
    }

   static Integer min = Integer.MAX_VALUE;

    public static int getMinimumDifference(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        list.add(root.val);

        dfs(root.left,list);
        dfs(root.right,list);

        return min;
    }

    private static void dfs(TreeNode node, List<Integer> list){
        if (node == null){return;}

        for (Integer temp : list){
           min = Math.min(Math.abs(temp - node.val), min);
        }

        list.add(node.val);

        dfs(node.left, list);
        dfs(node.right, list);
    }

}
