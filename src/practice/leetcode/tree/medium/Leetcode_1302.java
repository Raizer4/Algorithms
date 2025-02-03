package practice.leetcode.tree.medium;

// Deepest Leaves Sum
// https://leetcode.com/problems/deepest-leaves-sum/description/

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_1302 {

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

    }

    public static int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int sum = 0;

        while (!queue.isEmpty()){
            int size = queue.size();
            sum = 0;

            for (int i = 0; i < size; i++){
                TreeNode poll = queue.poll();

                sum += poll.val;

                if (poll.left != null){
                    queue.add(poll.left);
                }

                if (poll.right != null){
                    queue.add(poll.right);
                }
            }

        }


        return sum;
    }

}
