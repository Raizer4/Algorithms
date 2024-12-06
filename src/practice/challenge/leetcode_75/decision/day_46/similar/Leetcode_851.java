package practice.challenge.leetcode_75.decision.day_46.similar;

// Loud and Rich
// https://leetcode.com/problems/loud-and-rich/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_851 {

    public static void main(String[] args) {
        int[][] richer1 = {
                {1, 0}, {2, 1}, {3, 1}, {3, 7}, {4, 3}, {5, 3}, {6, 3}
        };

        int[] quiet1 = {3, 2, 5, 4, 6, 1, 7, 0};

        int[] result1 = loudAndRich(richer1, quiet1);

        System.out.println("Результат 1: " + Arrays.toString(result1));
    }

    public static int[] loudAndRich(int[][] richer, int[] quiet) {
        List<List<Integer>> graph = new ArrayList<>();

        int n = quiet.length;

        for (int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }

        for (int[] arr : richer){
            graph.get(arr[1]).add(arr[0]);
        }

        int[] answer = new int[n];
        Arrays.fill(answer, -1);

        for (int i = 0; i < n; i++){
            dfs(graph, quiet, answer, i);
        }

        return answer;
    }

    private static int dfs(List<List<Integer>> graph, int[] quiet, int[] answer, int node) {
        if (answer[node] != -1){
            return answer[node];
        }

        answer[node] = node;

        for (int richer : graph.get(node)){
            int candidate = dfs(graph, quiet, answer, richer);

            if (quiet[candidate] < quiet[answer[node]]){
                answer[node] = candidate;
            }
        }

        return answer[node];
    }


}
