package practice.leetcode.tree.easy;

// Range Sum of BST
// https://leetcode.com/problems/range-sum-of-bst/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_938 {

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
        System.out.println(rangeSumBST(new TreeNode(10, new TreeNode(5, new TreeNode(3), new TreeNode(7)), new TreeNode(15, null, new TreeNode(18))),7,15));
    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer> list = new ArrayList<>();
        dfs(root,list);
        int sum = 0;
        for (Integer temp : list){
            if (temp >= low && temp <= high){
                sum += temp;
            }
        }
        return sum;
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
