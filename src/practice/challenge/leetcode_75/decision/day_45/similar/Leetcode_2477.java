package practice.challenge.leetcode_75.decision.day_45.similar;

// Minimum Fuel Cost to Report to the Capital
// https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2477 {

    public static void main(String[] args) {
        int n1 = 6;
        int[][] connections1 = {{0,1}, {0,2}, {0,3}, {1,2}, {1,3}};
        System.out.println(minimumFuelCost(connections1, 2));
    }

    public static long minimumFuelCost(int[][] roads, int seats) {
        List<List<Integer>> list = new ArrayList<>();

        int n = roads.length + 1;

        for (int i = 0; i < n; i++){
            list.add(new ArrayList<>());
        }

        for (int[] temp : roads){
            list.get(temp[0]).add(temp[1]);
            list.get(temp[1]).add(temp[0]);
        }

        boolean[] visited = new boolean[n];
        long[] fuel = {0};

        dfs(0, list, seats, fuel, visited);

        return fuel[0];
    }

    private static int dfs(int node, List<List<Integer>> graph, int seats, long[] fuel, boolean[] visited) {
        int people = 1;
        visited[node] = true;

        for (Integer temp : graph.get(node)){
            if (!visited[temp]){
                people += dfs(temp,graph,seats,fuel,visited);
            }
        }

        if (node != 0) {
            fuel[0] += (people + seats - 1) / seats;
        }

        return people;
    }

}
