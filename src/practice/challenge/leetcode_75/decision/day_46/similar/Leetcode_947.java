package practice.challenge.leetcode_75.decision.day_46.similar;

// Most Stones Removed with Same Row or Column
// https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/description/

import java.util.HashSet;
import java.util.Set;

public class Leetcode_947 {
    public static void main(String[] args) {
        int[][] stones = {{0, 0}, {2, 2}, {10000, 2}};
        System.out.println(removeStones(stones));
    }

    public static int removeStones(int[][] stones) {
        UnionFind uf = new UnionFind(40000);
        for (int[] stone : stones) {
            uf.union(stone[0], stone[1] + 20000);
        }


        Set<Integer> uniqueRoots = new HashSet<>();
        for (int[] stone : stones) {
            uniqueRoots.add(uf.find(stone[0]));
        }


        return stones.length - uniqueRoots.size();
    }

    static class UnionFind {
        int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                parent[rootX] = rootY;
            }
        }
    }
}
