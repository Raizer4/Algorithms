package practice.challenge.leetcode_75.decision.day_45.similar;

// Number of Operations to Make Network Connected
// https://leetcode.com/problems/number-of-operations-to-make-network-connected/description/

import java.util.ArrayList;
import java.util.List;


public class Leetcode_1319 {

    public static void main(String[] args) {
        int n1 = 6;
        int[][] connections1 = {{0,1}, {0,2}, {0,3}, {1,2}, {1,3}};
        System.out.println(makeConnected(n1, connections1));
    }

    public static int makeConnected(int n, int[][] connections) {
        if (connections.length < n - 1) {
            return -1;
        }

        boolean[] visited = new boolean[n];

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for (int[] arr : connections){
            graph.get(arr[0]).add(arr[1]);
            graph.get(arr[1]).add(arr[0]);
        }

        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(i, graph, visited);
            }
        }

        return components - 1;
    }

    private static void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, graph, visited);
            }
        }
    }



}
