package practice.challenge.leetcode_75.decision.day_41;

// Search in a Binary Search Tree
// https://leetcode.com/problems/search-in-a-binary-search-tree/description/?envType=study-plan-v2&envId=leetcode-75

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
        if(root == null){
            return null;
        }

        if (root.val == val){
            return root;
        }

        TreeNode node_1 = searchBST(root.left, val);
        TreeNode node_2 = searchBST(root.right, val);

        if (node_1 != null){
            return node_1;
        }else if (node_2 != null){
            return node_2;
        }else {
            return null;
        }

    }



}
