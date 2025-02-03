package practice.leetcode.tree.medium;

// Count Nodes Equal to Average of Subtree
// https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2265 {

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

    static int count = 0;

    public static int averageOfSubtree(TreeNode root) {
        mergen(root);
        return count;
    }

    private static void mergen(TreeNode root){
        if (root == null){
            return;
        }

        List<Integer> list = new ArrayList<>();

        dfs(root, list);

        int sum = 0;

        for (int temp : list){
            sum += temp;
        }

        if (sum / list.size() == root.val){
            count++;
        }

        mergen(root.left);
        mergen(root.right);
    }

    private static void dfs(TreeNode root, List<Integer> list){
        if (root == null){return;}

        list.add(root.val);

        dfs(root.left, list);
        dfs(root.right, list);
    }

}
