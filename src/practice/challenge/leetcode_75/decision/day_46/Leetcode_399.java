package practice.challenge.leetcode_75.decision.day_46;

import java.util.*;

public class Leetcode_399 {

    public static void main(String[] args) {

    }

    public static double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();


        for (int i = 0; i < equations.size(); i++) {
            String var1 = equations.get(i).get(0);
            String var2 = equations.get(i).get(1);

            double value = values[i];

            graph.computeIfAbsent(var1, k -> new HashMap<>()).put(var2, value);
            graph.computeIfAbsent(var2, k -> new HashMap<>()).put(var1, 1.0 / value);
        }


        double[] results = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            String var1 = queries.get(i).get(0);
            String var2 = queries.get(i).get(1);

            if (!graph.containsKey(var1) || !graph.containsKey(var2)) {
                results[i] = -1.0;
            } else if (var1.equals(var2)) {
                results[i] = 1.0;
            } else {
                Set<String> visited = new HashSet<>();
                results[i] = dfs(graph, var1, var2, 1.0, visited);
            }
        }

        return results;
    }


    private static double dfs(Map<String, Map<String, Double>> graph, String current, String target, double value, Set<String> visited) {
        visited.add(current);

        if (graph.get(current).containsKey(target)) {
            return value * graph.get(current).get(target);
        }

        for (Map.Entry<String, Double> neighbor : graph.get(current).entrySet()) {
            String nextVar = neighbor.getKey();
            double edgeWeight = neighbor.getValue();

            if (!visited.contains(nextVar)) {
                double result = dfs(graph, nextVar, target, value * edgeWeight, visited);
                if (result != -1.0) {
                    return result;
                }
            }
        }

        return -1.0;
    }

}
