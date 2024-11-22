package practice.leetcode.leetcode_75.decision.day_33.similar;

// Binary Tree Postorder Traversal
// https://leetcode.com/problems/binary-tree-postorder-traversal/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_145 {

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

    }

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> dfs = preDFS(root);
        return dfs;
    }

    private List<Integer> preDFS(TreeNode root){
       List<Integer> list = new ArrayList<>();
       dfs(root,list);
       return list;
    }

    private void dfs (TreeNode treeNode , List<Integer> list){
       if (treeNode == null){
           return;
       }

       dfs(treeNode.left,list);
       dfs(treeNode.right,list);

       list.add(treeNode.val);
    }

}
