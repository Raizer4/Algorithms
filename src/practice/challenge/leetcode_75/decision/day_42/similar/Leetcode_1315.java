package practice.challenge.leetcode_75.decision.day_42.similar;

import java.util.LinkedList;
import java.util.List;

// Sum of Nodes with Even-Valued Grandparent
// https://leetcode.com/problems/sum-of-nodes-with-even-valued-grandparent/description/

public class Leetcode_1315 {

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
        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(7);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(3);

        root.left.left.left = new TreeNode(9);
        root.left.left.right = new TreeNode(1);
        root.left.right.right = new TreeNode(4);

        root.left.right.right.right = new TreeNode(5);

        System.out.println(sumEvenGrandparent(root));
    }

    static int sum = 0;

    public static int sumEvenGrandparent(TreeNode root) {
        if (root != null && root.left != null){
            List<Integer> queue = new LinkedList<>();
            queue.add(root.val);
            queue.add(root.left.val);
            dfs(root.left.left,queue,0);
            dfs(root.left.right,queue,0);
        }

        if (root != null && root.right != null){
            List<Integer> queue = new LinkedList<>();
            queue.add(root.val);
            queue.add(root.right.val);
            dfs(root.right.left,queue,0);
            dfs(root.right.right,queue,0);
        }

        return sum;
    }

    private static void dfs(TreeNode root, List<Integer> list, int index){
        if (root == null){return;}

        if (list.get(index) % 2 == 0){
            sum += root.val;
        }

        list.add(root.val);

        dfs(root.left,list,index+1);
        dfs(root.right,list,index+1);

        list.remove(list.size() - 1);
    }

}
