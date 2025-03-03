package practice.leetcode.graphs.medium;

// Loud and Rich
// https://leetcode.com/problems/loud-and-rich/description/

import java.util.*;

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
        List<List<Integer>> graphs = new ArrayList<>();

        for (int i = 0; i < quiet.length; i++) {
            graphs.add(new ArrayList<>());
        }

        for (int[] temp : richer){
            graphs.get(temp[1]).add(temp[0]);
        }

        int[] answer = new int[quiet.length];
        Arrays.fill(answer,-1);

        for (int i = 0; i < quiet.length; i++) {
            dfs(graphs,quiet,answer,i);
        }

        return answer;
    }


    private static int dfs(List<List<Integer>> graphs, int[] quiet, int[] answer, int node){
        if (answer[node] != -1){
            return answer[node];
        }

        answer[node] = node;

        for (Integer temp : graphs.get(node)){
            int candidates = dfs(graphs, quiet, answer, temp);

            if (quiet[candidates] < quiet[answer[node]]){
                answer[node] = candidates;
            }

        }

        return answer[node];
    }

}
