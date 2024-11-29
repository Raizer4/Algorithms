package practice.challenge.leetcode_75.decision.day_36.similar;

// N-ary Tree Preorder Traversal
// https://leetcode.com/problems/n-ary-tree-preorder-traversal/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_589 {

   static class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    };

    public static void main(String[] args) {
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        List<Node> children3 = List.of(node5, node6);
        Node node3 = new Node(3, children3);
        Node node2 = new Node(2);
        Node node4 = new Node(4);
        List<Node> children1 = List.of(node3, node2, node4);
        Node root = new Node(1, children1);


        List<Integer> result = preorder(root);

        System.out.println(result);
    }

    public static List<Integer> preorder(Node root) {
        if (root== null ){
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        dfs(root,list);
        return list;
    }

    private static void dfs(Node root, List<Integer> list){
        if (root == null){
            return;
        }

        for (Node child : root.children) {
            list.add(child.val);
            dfs(child,list);
        }
    }

}
