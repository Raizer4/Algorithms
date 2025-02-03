package practice.leetcode.tree.easy;

// Convert Sorted Array to Binary Search Tree
// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/

public class Leetcode_108 {

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
        int[] arr = new int[]{-10,-3,0,5,9};
        sortedArrayToBST(arr);
    }

    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return buildBST(nums, 0, nums.length - 1);
    }

    private static TreeNode buildBST(int[] nums, int left, int right) {
      if (left > right){
          return null;
      }

      int mind = left + (right - left) / 2;

      TreeNode node = new TreeNode(nums[mind]);

      node.left = buildBST(nums,left, mind - 1);
      node.right = buildBST(nums,mind + 1, right);

      return node;
    }

}
