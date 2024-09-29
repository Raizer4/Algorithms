package practice.leetcode.leetcode_75;

// Leaf-Similar Trees
// https://leetcode.com/problems/leaf-similar-trees/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;


public class Leetcode_872 {

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
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3)
        );

        TreeNode roote = new TreeNode(1,
                new TreeNode(3),
                new TreeNode(2)
        );

        System.out.println(leafSimilar(root,roote));
    }

    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        getLeaves(root1, leaves1);
        getLeaves(root2, leaves2);

        return leaves1.equals(leaves2);
    }


    private static void getLeaves(TreeNode node, List<Integer> leaves) {
        if (node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            leaves.add(node.val);
        }

        getLeaves(node.left, leaves);
        getLeaves(node.right, leaves);
    }

}
