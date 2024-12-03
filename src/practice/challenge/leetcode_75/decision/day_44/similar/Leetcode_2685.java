package practice.challenge.leetcode_75.decision.day_44.similar;

// Count the Number of Complete Components
// https://leetcode.com/problems/count-the-number-of-complete-components/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2685 {

    public static void main(String[] args) {
        int n1 = 6;

        int[][] edges1 = {{0, 1}, {0, 2}, {1, 2}, {3, 4}};
        System.out.println(countCompleteComponents(n1, edges1));

        int n2 = 6;

        int[][] edges2 = {{0, 1}, {0, 2}, {1, 2}, {3, 4}, {3, 5}};
        System.out.println(countCompleteComponents(n2, edges2));
    }

    public static int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];

        int completeComponents = 0;


        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                List<Integer> component = new ArrayList<>();
                int edgeCount = dfs(i, graph, visited, component);

                int vertexCount = component.size();

                if (edgeCount / 2 == vertexCount * (vertexCount - 1) / 2) {
                    completeComponents++;
                }
            }
        }

        return completeComponents;
    }

    private static int dfs(int node, List<List<Integer>> graph, boolean[] visited, List<Integer> component) {
        visited[node] = true;
        component.add(node);

        int edgeCount = 0;

        for (int neighbor : graph.get(node)) {
            edgeCount++;

            if (!visited[neighbor]) {
                edgeCount += dfs(neighbor, graph, visited, component);
            }
        }
        return edgeCount;
    }



}
