package practice.leetcode.graphs.easy;

// Find if Path Exists in Graph
// https://leetcode.com/problems/find-if-path-exists-in-graph/description/


import java.util.ArrayList;
import java.util.List;

public class Leetcode_1971 {

    public static void main(String[] args) {
        System.out.println(validPath(2, new int[][]{{0,1},{1,2}}, 0,2));
    }

    private static boolean[] visited;

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graphs = new ArrayList<>();

        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            graphs.add(new ArrayList<>());
        }
        
        for (int[] arr : edges){
            graphs.get(arr[0]).add(arr[1]);
            graphs.get(arr[1]).add(arr[0]);
        }

       dfs(source, graphs, destination);

        return visited[destination];
    }

    private static void dfs(int node, List<List<Integer>> graphs, int destination){
        if (visited[node]){
            return;
        }

        visited[node] = true;

        for (Integer temp: graphs.get(node)){
            dfs(temp, graphs, destination);
        }

    }

}
