package practice.challenge.leetcode_75;

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1466 {

    public static void main(String[] args) {

    }

    public static int minReorder(int n, int[][] connections) {
        // Создаем граф, представляющий дороги как двунаправленные ребра
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Строим граф, помечая дороги: если направление от текущего города, помечаем как 1, если к городу - как 0
        for (int[] connection : connections) {
            graph.get(connection[0]).add(new int[]{connection[1], 1}); // направление от города
            graph.get(connection[1]).add(new int[]{connection[0], 0}); // направление к городу
        }

        // Выполняем DFS от города 0, чтобы проверить, какие дороги нужно изменить
        return dfs(0, -1, graph);
    }

    // Функция DFS для обхода графа
    private static int dfs(int node, int parent, List<List<int[]>> graph) {
        int changes = 0;


        for (int[] neighbor : graph.get(node)) {
            int nextCity = neighbor[0];
            int roadDirection = neighbor[1];

            if (nextCity != parent) {
                changes += roadDirection + dfs(nextCity, node, graph);
            }
        }

        return changes;
    }

}
