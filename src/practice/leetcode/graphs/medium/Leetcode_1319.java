package practice.leetcode.graphs.medium;

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
        if (connections.length  < n - 1){
            return -1;
        }

        List<List<Integer>> graphs = new ArrayList<>();

        for (int i = 0; i < n; i++){
            graphs.add(new ArrayList<>());
        }

        for (int[] arr : connections){
            graphs.get(arr[0]).add(arr[1]);
            graphs.get(arr[1]).add(arr[0]);
        }

        boolean[] visited = new boolean[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]){
                dfs(i, graphs, visited);
                count++;
            }
        }

        return count - 1;
    }

    private static void dfs(int node, List<List<Integer>> graphs, boolean[] visited){
        if (visited[node]){
            return;
        }

        visited[node] = true;

        for (Integer temp : graphs.get(node)){
            dfs(temp,graphs,visited);
        }
    }

}
