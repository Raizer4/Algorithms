package practice.challenge.leetcode_75.decision.day_45.similar;

// Redundant Connection
// https://leetcode.com/problems/redundant-connection/description/

public class Leetcode_684 {

    public static void main(String[] args) {
        int n1 = 6;
        int[][] connections1 = {{1,2}, {2,3}, {3,4}, {1,4}, {1,5}};
        System.out.println(findRedundantConnection(connections1));
    }

    public static int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;

        int[] parent = new int[n + 1];
        int[] rank = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            rank[i] = 0;
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (!union(u, v, parent, rank)) {
                return edge;
            }
        }

        return new int[0];
    }

    private static int find(int node, int[] parent) {
        if (node != parent[node]) {
            parent[node] = find(parent[node], parent);
        }
        return parent[node];
    }

    private static boolean union(int u, int v, int[] parent, int[] rank) {
        int rootU = find(u, parent);
        int rootV = find(v, parent);

        if (rootU == rootV) {
            return false;
        }

        if (rank[rootU] > rank[rootV]) {
            parent[rootV] = rootU;
        } else if (rank[rootU] < rank[rootV]) {
            parent[rootU] = rootV;
        } else {
            parent[rootV] = rootU;
            rank[rootU]++;
        }

        return true;
    }

}
