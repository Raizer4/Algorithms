package practice.challenge.leetcode_75.decision.day_37.similar;

// Maximum Depth of N-ary Tree
// https://leetcode.com/problems/maximum-depth-of-n-ary-tree/description/

import java.util.List;

public class Leetcode_559 {

    static class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }

    public static void main(String[] args) {

    }

    int max = 0;

    public int maxDepth(Node root) {
        dfs(root, 1);
        return max;
    }

    private void dfs(Node root, int len){
        if (root == null){
            return;
        }

        max = Math.max(max,len);

        for (Node child : root.children) {
            dfs(child, len + 1);
        }
    }

}
