package practice.leetcode.tree.easy;

// Same Tree
// https://leetcode.com/problems/same-tree/description/

public class Leetcode_100 {

    static class TreeNode {
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
        System.out.println(isSameTree(new TreeNode(1,new TreeNode(2),new TreeNode(3)),new TreeNode(1,new TreeNode(2),new TreeNode(3))));
    }

    static boolean flag = true;

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        dfs(p,q);
        return flag;
    }

    private static void dfs(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return;
        }

        if (p == null || q == null){
            flag = false;
            return;
        }

        if (p.val != q.val){
            flag = false;
            return;
        }

        dfs(p.left, q.left);
        dfs(p.right, q.right);
    }

}