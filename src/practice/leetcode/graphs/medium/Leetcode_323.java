package practice.leetcode.graphs.medium;

// Number of Connected Components In An Undirected Graph
// https://neetcode.io/problems/count-connected-components

import java.util.ArrayList;
import java.util.List;

public class Leetcode_323 {

    public static void main(String[] args) {
        System.out.println(countComponents(5, new int[][]{{0,1},{1,2},{2,3},{4,5}}));
    }

    public static int countComponents(int n, int[][] edges) {
        List<List<Integer>> graphs = new ArrayList<>();
        boolean[] visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            graphs.add(new ArrayList<>());
        }

        for (int[] arr : edges){
            graphs.get(arr[0]).add(arr[1]);
            graphs.get(arr[1]).add(arr[0]);
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visit[i]){
                dfs(i, visit, graphs);
                count++;
            }
        }

        return count;
    }

    private static void dfs(int node, boolean[] visit , List<List<Integer>> graphs){
        visit[node] = true;

        for (Integer num : graphs.get(node)){
            if (!visit[num]){
                dfs(num, visit, graphs);
            }
        }
    }

}
