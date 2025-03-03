package practice.leetcode.graphs.medium;

// Minimum Fuel Cost to Report to the Capital
// https://leetcode.com/problems/minimum-fuel-cost-to-report-to-the-capital/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_2477 {

    public static void main(String[] args) {
        int n1 = 6;
        int[][] connections1 = {{3,1}, {3,2}, {1,0}, {0,4},{0,5},{4,6}};
        System.out.println(minimumFuelCost(connections1, 5));
    }

    private static boolean[] visited;

    public static long minimumFuelCost(int[][] roads, int seats) {
        visited = new boolean[roads.length + 1];

        List<List<Integer>> graphs = new ArrayList<>();

        for (int i = 0; i < roads.length + 1; i++){
            graphs.add(new ArrayList<>());
        }

        for (int[] arr : roads){
            graphs.get(arr[0]).add(arr[1]);
            graphs.get(arr[1]).add(arr[0]);
        }

        long[] fuel = {0};

        dfs(0,graphs,seats,fuel);

        return fuel[0];
    }

    private static int dfs(int node, List<List<Integer>> graphs, int seats, long[] fuel){
        int people = 1;
        visited[node] = true;

        for (int temp : graphs.get(node)){
            if (!visited[temp]){
                people += dfs(temp,graphs,seats,fuel);
            }
        }

        if (node != 0){
            fuel[0] += (people + seats - 1) / seats;
        }

        return people;
    }


}
