package practice.challenge.leetcode_75.decision.day_46.similar;

// All Ancestors of a Node in a Directed Acyclic Graph
// https://leetcode.com/problems/all-ancestors-of-a-node-in-a-directed-acyclic-graph/description/

import java.util.*;

public class Leetcode_2192 {

    public static void main(String[] args) {
        int n = 8;
        int[][] edges = {
                {0, 3}, {0, 4}, {1, 3}, {2, 4}, {2, 7}, {3, 5}, {3, 6}, {3, 7}, {4, 6}
        };
        List<List<Integer>> result = getAncestors(n, edges);
        System.out.println(result);
    }

    public static List<List<Integer>> getAncestors(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[1]).add(edge[0]);
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++){
            Set<Integer> set = new TreeSet<>();
            dfs(graph,set, i);
            List<Integer> list = new ArrayList<>(set);
            Collections.sort(list);
            result.set(i,list);
        }

        return result;
    }

    private static void dfs(List<List<Integer>> graph, Set<Integer> set, int node) {
        for (Integer neighbor : graph.get(node)){
            if (set.add(neighbor)){
                dfs(graph,set,neighbor);
            }
        }
    }


}
