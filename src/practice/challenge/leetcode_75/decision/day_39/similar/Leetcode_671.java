package practice.challenge.leetcode_75.decision.day_39.similar;

// Second Minimum Node In a Binary Tree
// https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/description/

import java.util.Set;
import java.util.TreeSet;

public class Leetcode_671 {

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
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);
        System.out.println(findSecondMinimumValue(root));
    }

    public static int findSecondMinimumValue(TreeNode root) {
        Set<Integer> set = new TreeSet<>();

        dfs(root,set);

        if (set.size() <= 1){
            return -1;
        }else {
            int i = 0;
            for (Integer temp : set){
                i++;
                if (i == 2){
                    return temp;
                }
            }
        }

        return -1;
    }

    private static void dfs(TreeNode treeNode , Set<Integer> set){
        if (treeNode == null){
            return;
        }

        set.add(treeNode.val);


        dfs(treeNode.left,set);
        dfs(treeNode.right,set);
    }

}
