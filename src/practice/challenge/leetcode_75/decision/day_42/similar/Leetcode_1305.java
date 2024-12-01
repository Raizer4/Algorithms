package practice.challenge.leetcode_75.decision.day_42.similar;

// All Elements in Two Binary Search Trees
// https://leetcode.com/problems/all-elements-in-two-binary-search-trees/description/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leetcode_1305 {

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
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);


        TreeNode node = new TreeNode(6);
        node.left = new TreeNode(7);
        node.right = new TreeNode(8);
        node.left.left = new TreeNode(2);
        node.left.right = new TreeNode(7);
        node.right.left = new TreeNode(1);
        node.right.right = new TreeNode(3);

        getAllElements(root,node);
    }

    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new ArrayList<>();

        dfs(root1 , list_1);
        dfs(root2 , list_2);

        List<Integer> result = new ArrayList<>();
        result.addAll(list_1);
        result.addAll(list_2);
        Collections.sort(result);

        return result;
    }

    public static void dfs(TreeNode node, List<Integer> list){
        if (node == null){
            return;
        }

        list.add(node.val);

        dfs(node.left, list);
        dfs(node.right, list);
    }

}
