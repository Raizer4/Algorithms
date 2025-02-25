package practice.leetcode.graphs.medium;

// Clone Graph
// https://leetcode.com/problems/clone-graph/description/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode_133 {

    public static void main(String[] args) {
        System.out.println(cloneGraph(new Node(2)));
    }

    static class Node {
        public int val;
        public List<Node> neighbors;

        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }

        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }

    }

    public static Node cloneGraph(Node node) {
        Map<Node, Node> map = new HashMap<>();

        return dfs(node, map);
    }

    private static Node dfs(Node node, Map<Node, Node> map){
        if (node == null){
            return null;
        }

        if (map.containsKey(node)){
            return map.get(node);
        }

        Node copy = new Node(node.val);
        map.put(node,copy);

        for (Node nei : node.neighbors){
            nei.neighbors.add(dfs(nei, map));
        }

        return copy;
    }


}
