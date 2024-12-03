package practice.challenge.leetcode_75.decision.day_44.similar;

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

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> paths = new ArrayList<>();
        dfs(graph,0, path, paths);
        return paths;
    }

    private static void dfs(int[][] graph, int node, List<Integer> path, List<List<Integer>> paths){
        path.add(node);

        if (node == graph.length - 1){
            List<Integer> list = new ArrayList<>();
            list.addAll(path);
            paths.add(list);
        }else {
            for (int index : graph[node]){
                dfs(graph,index,path,paths);
            }
        }

        path.remove(path.size() - 1);
    }

}
