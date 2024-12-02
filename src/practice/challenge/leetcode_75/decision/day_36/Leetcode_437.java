package practice.challenge.leetcode_75.decision.day_36;

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

    static int total = 0;

    public static int pathSum(TreeNode root, int targetSum) {
        if (root == null || targetSum == 0){
            return 0;
        }

        countingSum(root, 0, targetSum);

        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return total;
    }

    private static void countingSum(TreeNode root, int sum, int targetSum) {
        if (root == null) {
            return;
        }

        sum += root.val;

        if (sum == targetSum){
            total++;
        }

        countingSum(root.left, sum, targetSum);
        countingSum(root.right, sum, targetSum);
    }

}
