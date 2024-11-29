package practice.challenge.leetcode_75.decision.day_37.similar;

// Binary Tree Tilt
// https://leetcode.com/problems/binary-tree-tilt/description/

public class Leetcode_563 {

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
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(3), new TreeNode(5)),
                new TreeNode(9, null, new TreeNode(7))
        );

        Leetcode_563 leetcode_563 = new Leetcode_563();
        System.out.println(leetcode_563.findTilt(root));
    }

    int sum = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return sum;
    }

    private void dfs(TreeNode root){
        if (root == null){
            return;
        }

        if (root.left == null && root.right == null){
            return;
        }

        int temp = Math.abs(sumOfNodes(root.left) - sumOfNodes(root.right));
        sum += temp;

        dfs(root.left);
        dfs(root.right);
    }

    public static int sumOfNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return root.val + sumOfNodes(root.left) + sumOfNodes(root.right);
    }

}
