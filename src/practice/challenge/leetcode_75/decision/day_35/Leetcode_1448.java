package practice.challenge.leetcode_75.decision.day_35;

// Count Good Nodes in Binary Tree
// https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_1448 {

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
        TreeNode root = new TreeNode(3,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5))
        );
        System.out.println(goodNodes(root));
    }

    public static int goodNodes(TreeNode root) {
        return countGoodNodes(root, root.val);
    }

    private static int countGoodNodes(TreeNode node, int maxSoFar) {
        if (node == null){
            return 0;
        }

        int count = 0;

        if (node.val >= maxSoFar){
            count = 1;
        }

        maxSoFar = Math.max(maxSoFar, node.val);

       count += countGoodNodes(node.left, maxSoFar);
       count += countGoodNodes(node.right, maxSoFar);

       return count;
    }



}
