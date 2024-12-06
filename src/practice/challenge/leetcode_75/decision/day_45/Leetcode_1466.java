package practice.challenge.leetcode_75.decision.day_45;

// Reorder Routes to Make All Paths Lead to the City Zero
// https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1466 {

    public static void main(String[] args) {
        int n1 = 6;
        int[][] connections1 = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        System.out.println(minReorder(n1, connections1));

        int n2 = 5;
        int[][] connections2 = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        System.out.println(minReorder(n2, connections2));

        int n3 = 3;
        int[][] connections3 = {{1, 0}, {2, 0}};
        System.out.println(minReorder(n3, connections3));
    }

    public static int minReorder(int n, int[][] connections) {
        List<List<int[]>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for(int[] temp : connections){
            graph.get(temp[0]).add(new int[]{temp[1], 1});
            graph.get(temp[1]).add(new int[]{temp[0], 0});
        }

        boolean[] visited = new boolean[n];

        return dfs(0, graph,visited);
    }

    private static int dfs(int node, List<List<int[]>> graph, boolean[] visited) {
        visited[node] = true;

        int prev = 0;

        for (int[] temp : graph.get(node)){
            int nextNode = temp[0];
            int direction = temp[1];

            prev += direction;

            if (!visited[nextNode]){
                prev += dfs(nextNode, graph, visited);
            }

        }

        return prev;
    }

}
