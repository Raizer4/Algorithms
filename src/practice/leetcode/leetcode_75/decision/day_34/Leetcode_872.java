package practice.leetcode.leetcode_75.decision.day_34;

// Leaf-Similar Trees
// https://leetcode.com/problems/leaf-similar-trees/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
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
        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new ArrayList<>();


        dfs(root1,list_1);
        dfs(root2,list_2);

        return list_1.equals(list_2);
    }

    private static void dfs(TreeNode root , List<Integer> list){
        if (root == null){
            return;
        }

        if (root.right == null && root.left == null){
            list.add(root.val);
        }

        dfs(root.left,list);
        dfs(root.right,list);
    }



}
