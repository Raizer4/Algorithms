package practice.challenge.leetcode_75.decision.day_38.similar;


// Cousins in Binary Tree
// https://leetcode.com/problems/cousins-in-binary-tree/description/


public class Leetcode_933 {

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
        TreeNode left = new TreeNode(2,null,new TreeNode(4));
        TreeNode right = new TreeNode(3,null,new TreeNode(5));
        treeNode.left = left;
        treeNode.right = right;
        System.out.println(isCousins(treeNode,4,5));
    }

    private static TreeNode xParent = null;
    private static TreeNode yParent = null;
    private static int xDepth = -1;
    private static int yDepth = -1;

    public static boolean isCousins(TreeNode root, int x, int y) {
        dfs(root, null, 0, x, y);
        return xDepth == yDepth && xParent != yParent;
    }

    private static void dfs(TreeNode node, TreeNode parent, int depth, int x, int y) {
        if (node == null){return;}

        if (node.val == x){
            xParent = parent;
            xDepth = depth;
        }

        if (node.val == y){
            yParent = parent;
            yDepth = depth;
        }


        if (xParent != null && yParent != null){
            return;
        }


        dfs(node.left,node,depth+1,x,y);
        dfs(node.right,node,depth+1,x,y);
    }


}
