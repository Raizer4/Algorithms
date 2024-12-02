package practice.challenge.leetcode_75.decision.day_39;

// Binary Tree Right Side View
// https://leetcode.com/problems/binary-tree-right-side-view/description/?envType=study-plan-v2&envId=leetcode-75



import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode_199 {

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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        System.out.println(rightSideView(root));
    }

    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        if (root == null){
            return list;
        }

        Queue<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);

        while (!nodes.isEmpty()) {
            int size = nodes.size();
            int last = 0;

            for (int i = 0; i < size; i++){
                TreeNode poll = nodes.poll();
                last = poll.val;

                if (poll.left != null){
                    nodes.add(poll.left);
                }
                if (poll.right != null){
                    nodes.add(poll.right);
                }
            }
            list.add(last);
        }

        return list;
    }




}
