package practice.leetcode.graphs.medium;

// Find Eventual Safe States
// https://leetcode.com/problems/find-eventual-safe-states/description/

import java.util.*;

public class Leetcode_802 {

    public static void main(String[] args) {
        int[][] graph1 = {{}, {0,2,3,4}, {3}, {4}, {}};
        System.out.println(eventualSafeNodes(graph1));

        int[][] graph2 = {{1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}};
        System.out.println(eventualSafeNodes(graph2));
    }

    private static boolean[] isTrue;

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        isTrue = new boolean[graph.length];


        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < graph.length; i++) {
            boolean[] visited = new boolean[graph.length];

            if (isTrue[i]){
                res.add(i);
                continue;
            }

            if (dfs(i, graph, visited)){
                res.add(i);
            }
        }

        return res;
    }

    private static boolean dfs(int r, int[][] graph, boolean[] visited){
        if (graph[r].length == 0 || isTrue[r]){
            isTrue[r] = true;
            return true;
        }

        if (visited[r]){
            return false;
        }

        visited[r] = true;

        for (int temp : graph[r]){
            if (!dfs(temp,graph,visited)){
                return false;
            }
        }

        isTrue[r] = true;
        return true;
    }


}
