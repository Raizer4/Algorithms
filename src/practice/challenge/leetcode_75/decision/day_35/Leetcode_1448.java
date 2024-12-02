package practice.challenge.leetcode_75.decision.day_35;

// Count Good Nodes in Binary Tree
// https://leetcode.com/problems/count-good-nodes-in-binary-tree/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_1448 {

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
        TreeNode root = new TreeNode(3,
                new TreeNode(1, new TreeNode(3), null),
                new TreeNode(4, new TreeNode(1), new TreeNode(5))
        );
        System.out.println(goodNodes(root));
    }

    static int count = 0;

    public static int goodNodes(TreeNode root) {
        countGoodNodes(root, root.val);
        return count;
    }

    private static void countGoodNodes(TreeNode root, int max){
        if (root == null){
            return;
        }

        if (root.val >= max){
            count++;
        }

        max = Math.max(max,root.val);

        countGoodNodes(root.left,max);
        countGoodNodes(root.right,max);
    }

}





