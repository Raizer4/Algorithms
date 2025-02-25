package practice.leetcode.graphs.medium;

// Redundant Connection
// https://leetcode.com/problems/redundant-connection/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_684 {

    public static void main(String[] args) {
        int n1 = 6;
        int[][] connections1 = {{1,2}, {2,3}, {3,4}, {1,4}, {1,5}};
        System.out.println(findRedundantConnection(connections1));
    }

    public static int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        List<List<Integer>> graphs = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graphs.add(new ArrayList<>());
        }

        for (int[] arr : edges){
            int u = arr[0], v = arr[1];

            graphs.get(u).add(v);
            graphs.get(v).add(u);
            boolean[] visit = new boolean[n + 1];

            if (dfs(u, -1, graphs, visit)){
                return arr;
            }
        }

        return new int[0];
    }

    private static boolean dfs (int node, int parent, List<List<Integer>> graphs, boolean[] visit){
        if (visit[node]){
            return true;
        }

        visit[node] = true;

        for (int temp : graphs.get(node)){
            if (temp == parent){
                continue;
            }

            if (dfs(temp,node,graphs, visit)){
                return true;
            }
        }

        return false;
    }

}
