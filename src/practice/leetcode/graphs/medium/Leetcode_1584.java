package practice.leetcode.graphs.medium;

// Min Cost to Connect All Points
// https://leetcode.com/problems/min-cost-to-connect-all-points/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1584 {

    public static void main(String[] args) {
        System.out.println(minCostConnectPoints(new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}}));
    }

    public static int minCostConnectPoints(int[][] points) {
        int n = points.length;
        List<int[]> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int cost = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                edges.add(new int[]{cost, i, j});
            }
        }

        edges.sort((a, b) -> Integer.compare(a[0], b[0]));

        UnionFind uf = new UnionFind(n);
        int totalCost = 0;

        for (int[] edge : edges) {
            int cost = edge[0];
            int u = edge[1];
            int v = edge[2];

            if (uf.find(u) != uf.find(v)) {
                uf.union(u, v);
                totalCost += cost;
            }
        }

        return totalCost;
    }

    private static class UnionFind {
        int[] base;

        public UnionFind(int size) {
            base = new int[size];

            for (int i = 0; i < size; i++) {
                base[i] = i;
            }
        }

        public int find(int x) {
            if (base[x] != x) {
                base[x] = find(base[x]);
            }
            return base[x];
        }

        public void union(int x, int y) {
            int tempx = find(x);
            int tempy = find(y);

            if (tempx != tempy) {
                base[tempx] = tempy;
            }
        }

    }

}
