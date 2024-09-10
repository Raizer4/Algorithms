package practice.leetcode.tree;

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null){
            return p == q;
        }

        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right,p.right);
    }


}