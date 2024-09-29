package practice.leetcode.leetcode_75;

// Search in a Binary Search Tree
// https://leetcode.com/problems/search-in-a-binary-search-tree/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Stack;

public class Leetcode_700 {

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
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);

        TreeNode node = searchBST(treeNode,2);

        System.out.println(node.val);
    }

    public static TreeNode searchBST(TreeNode root, int val) {
       if (root.val == val){
           return root;
       }

       Stack<TreeNode> stack = new Stack<>();

       TreeNode current = root;

       while (current != null || !stack.empty()){
           while (current != null){
                if (current.val == val){
                    return current;
                }
                stack.push(current);
                current = current.left;
           }

           TreeNode pop = stack.pop();
           current = pop.right;
       }


       return null;
    }



}
