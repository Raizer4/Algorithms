package practice.leetcode.tree.medium;

// Maximum Level Sum of a Binary Tree
// https://leetcode.com/problems/maximum-level-sum-of-a-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_1161 {

    static public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(989);
        root.right = new TreeNode(10250);
        root.right.left = new TreeNode(98693);
        root.right.right = new TreeNode(-89388);
        root.right.right.right = new TreeNode(-32127);

        System.out.println(maxLevelSum(root));
    }

    public static int maxLevelSum(TreeNode root) {
        int count = 0;
        int depth = 1;
        int max = Integer.MIN_VALUE;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int level = queue.size();
            int tempMax = 0;

            for (int i = 0; i < level; i++) {
                TreeNode poll = queue.poll();

                tempMax += poll.val;

                if (poll.left != null) {
                    queue.add(poll.left);
                }

                if (poll.right != null) {
                    queue.add(poll.right);
                }
            }


            if (tempMax > max) {
                count = depth;
                max = tempMax;
            }

            depth++;
        }

        return count;
    }

}
