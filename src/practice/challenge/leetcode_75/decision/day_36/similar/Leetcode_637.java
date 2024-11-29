package practice.challenge.leetcode_75.decision.day_36.similar;

// Average of Levels in Binary Tree
// https://leetcode.com/problems/average-of-levels-in-binary-tree/description/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_637 {

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
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(1);

        TreeNode temp = new TreeNode(15);
        TreeNode treeNode_2 = new TreeNode(20);
        treeNode_2.left = temp;
        treeNode_2.right = new TreeNode(7);

        treeNode.right = treeNode_2;

        averageOfLevels(treeNode);
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            double sum = 0;

            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                sum += current.val;

                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
            }

            result.add(sum / levelSize);
        }

        return result;
    }




}
