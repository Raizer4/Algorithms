package practice.leetcode.tree.easy;

// Univalued Binary Tree
// https://leetcode.com/problems/univalued-binary-tree/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_965 {

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
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(1);
        TreeNode temp = new TreeNode(15);
        TreeNode treeNode_2 = new TreeNode(20);
        treeNode_2.left = temp;
        treeNode_2.right = new TreeNode(7);
        treeNode.right = treeNode_2;
        isUnivalTree(treeNode);
    }

    public static boolean isUnivalTree(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);

        int temp = list.get(0);

        for (Integer te : list){
            if (te != temp){
                return false;
            }
        }

        return true;
    }

    private static void dfs(TreeNode treeNode, List<Integer> list){
       if (treeNode == null){
           return;
       }

       list.add(treeNode.val);

       dfs(treeNode.left, list);
       dfs(treeNode.right,list);
    }

}
