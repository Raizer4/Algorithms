package practice.leetcode.leetcode_75;

// Maximum Depth of Binary Tree
// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Stack;

public class Leetcode_104 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, new TreeNode(4), new TreeNode(5)),
                new TreeNode(3));
        System.out.println(maxDepth(root));
    }

    public static class TreeNode {
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

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> depthStack = new Stack<>();
        int maxDepth = 0;

        stack.push(root);
        depthStack.push(1);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            int currentDepth = depthStack.pop();

            if (node != null) {
                maxDepth = Math.max(maxDepth, currentDepth); // Обновляем максимальную глубину


                if (node.right != null) {
                    stack.push(node.right);
                    depthStack.push(currentDepth + 1);
                }


                if (node.left != null) {
                    stack.push(node.left);
                    depthStack.push(currentDepth + 1);
                }
            }
        }

        return maxDepth;
    }

}
