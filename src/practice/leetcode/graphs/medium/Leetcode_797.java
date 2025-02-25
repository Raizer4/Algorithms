package practice.leetcode.graphs.medium;

// All Paths From Source to Target
// https://leetcode.com/problems/all-paths-from-source-to-target/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_797 {

    public static void main(String[] args) {
        System.out.println(allPathsSourceTarget(new int[][]{
                {1, 2},
                {3},
                {3},
                {}
        }));
    }

    private static List<List<Integer>> result = new ArrayList<>();


    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        dfs(0, graph.length - 1, graph, new ArrayList<>());

        return result;
    }

    private static void dfs(int node, int destination, int[][] graph , List<Integer> list){
        list.add(node);

        if (node == destination){
            result.add(new ArrayList<>(list));
        }

        for (int temp : graph[node]){
            dfs(temp, destination, graph, list);
            list.remove(Integer.valueOf(temp));
        }

    }


}
