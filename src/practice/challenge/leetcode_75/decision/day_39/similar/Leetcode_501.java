package practice.challenge.leetcode_75.decision.day_39.similar;

// Find Mode in Binary Search Tree
// https://leetcode.com/problems/find-mode-in-binary-search-tree/description/

import java.util.*;

public class Leetcode_501 {

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
        TreeNode treeNode = new TreeNode(1);

        treeNode.right = new TreeNode(2).left = new TreeNode(2);

        int[] mode = findMode(treeNode);

        for (int temp : mode){
            System.out.println(temp);
        }

    }

    public static int[] findMode(TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();

        dfs(root,map);

        Integer max = Collections.max(map.values());

        List<Integer> list = new ArrayList<>();

        for (Map.Entry entry : map.entrySet()){
            if (entry.getValue() == max){
                list.add((int) entry.getKey());
            }
        }

        if (list.isEmpty()){
            return new int[] { -1 };
        }else {
            int[] ints = new int[list.size()];

            for (int i = 0; i < list.size(); i++){
                ints[i] = list.get(i);
            }

            return ints;
        }


    }

    private static void dfs(TreeNode root, HashMap<Integer,Integer> map){
        if (root == null){
            return;
        }

        map.put(root.val, map.getOrDefault(root.val,0) + 1);

        dfs(root.left,map);
        dfs(root.right,map);
    }


}
