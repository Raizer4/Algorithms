package practice.leetcode.tree.easy;

// N-ary Tree Postorder Traversal
// https://leetcode.com/problems/n-ary-tree-postorder-traversal/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_590 {

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
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(3, Arrays.asList(new Node(5), new Node(6)));
        Node child2 = new Node(2);
        Node child3 = new Node(4);

        root.children = Arrays.asList(child1, child2, child3);

        List<Integer> result = postorder(root);

        System.out.println(result);
    }

    public static List<Integer> postorder(Node root) {
       if (root == null){
           return new ArrayList<>();
       }

       List<Integer> list = new ArrayList<>();
       dfs(root,list);
       return list;
    }

    private static void dfs(Node root,List<Integer> list){
        for (Node temp : root.children){
            if (temp.children == null || temp.children.isEmpty()){
                list.add(temp.val);
            }else {
                dfs(temp,list);
            }
        }
        list.add(root.val);
    }

}
