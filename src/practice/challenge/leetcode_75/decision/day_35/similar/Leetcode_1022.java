package practice.challenge.leetcode_75.decision.day_35.similar;

// Sum of Root To Leaf Binary Numbers
// https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1022 {

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
        TreeNode root = new TreeNode(3, new TreeNode(1, new TreeNode(3), null), new TreeNode(4, new TreeNode(1), new TreeNode(5)));
        System.out.println(sumRootToLeaf(root));
    }

    public static int sumRootToLeaf(TreeNode root) {
       List<String> list = new ArrayList<>();

       dfs(root,"",list);

       int sum = 0;

       for (String temp : list){
           sum += Integer.parseInt(temp,2);
       }

       return sum;
    }

    private static void dfs(TreeNode root, String str, List<String> res){
       if (root == null){
           return;
       }

       str += root.val;

       if (root.left == null && root.right == null){
           res.add(str);
           return;
       }

       dfs(root.left,str,res);

       dfs(root.right,str,res);
    }

}
