package practice.leetcode.leetcode_75.day_8;

// Path Sum III
// https://leetcode.com/problems/path-sum-iii/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_437 {

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
        System.out.println(pathSum(root, 4));
    }
    private static int total = 0;

    public static int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        helper(root, sum, 0);
        pathSum(root.left, sum);
        pathSum(root.right, sum);

        return total;
    }

    private static void helper(TreeNode root, int sum, long curr) {
        if (root == null) {
            return;
        }

        curr += root.val;

        if (curr == sum) {
            total++;
        }

        helper(root.left, sum, curr);
        helper(root.right, sum, curr);
    }


}
