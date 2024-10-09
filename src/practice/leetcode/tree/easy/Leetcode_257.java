package practice.leetcode.tree.easy;

// Binary Tree Paths
// https://leetcode.com/problems/binary-tree-paths/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_257 {

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
        System.out.println(binaryTreePaths(new TreeNode(1,new TreeNode(2,null,new TreeNode(5)),new TreeNode(3))));
    }

    public static List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        dfs(root,"",list);
        return list;
    }

    private static void dfs(TreeNode root, String str, List<String> list){
        if (root == null)
        {
            return;
        }

        str+=root.val;

        if (root.left == null && root.right == null){
            list.add(str);
        }else {
            str+= "->";
            dfs(root.left,str,list);
            dfs(root.right,str,list);
        }

    }

}
