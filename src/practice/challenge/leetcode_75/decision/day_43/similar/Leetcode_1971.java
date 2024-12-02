package practice.challenge.leetcode_75.decision.day_43.similar;

// Find if Path Exists in Graph
// https://leetcode.com/problems/find-if-path-exists-in-graph/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1971 {

    public static void main(String[] args) {

    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adjList.get(edge[0]).add(edge[1]);
            adjList.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        return dfs(source, destination, adjList, visited);
    }

    private static boolean dfs(int current, int destination, List<List<Integer>> adjList, boolean[] visited) {
        if (current == destination) return true;

        visited[current] = true;

        for (int neighbor : adjList.get(current)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, destination, adjList, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

}
