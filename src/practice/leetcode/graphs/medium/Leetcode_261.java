package practice.leetcode.graphs.medium;

// Graph Valid Tree
// https://neetcode.io/solutions/graph-valid-tree

import java.util.*;

public class Leetcode_261 {

    public static void main(String[] args) {
        System.out.println(validTree(5, new int[][]{{0, 1},{0, 2},{0, 3},{1, 4}}));
    }


    public static boolean validTree(int n, int[][] edges) {
        if (edges.length > n - 1){
            return false;
        }

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] arr : edges){
            adj.get(arr[0]).add(arr[1]);
            adj.get(arr[1]).add(arr[0]);
        }

        Set<Integer> visit = new HashSet<>();

        if (!dfs(0,-1, visit, adj)){
            return false;
        }

        return visit.size() == n;
    }

    private static boolean dfs(int node, int parent, Set<Integer> visit, List<List<Integer>> adj) {
        if (visit.contains(node)){
            return false;
        }

        visit.add(node);

        for (int nei : adj.get(node)){
            if (nei == parent){
                continue;
            }

            if (!dfs(nei, node, visit, adj)){
                return false;
            }

        }

        return true;
    }


}
