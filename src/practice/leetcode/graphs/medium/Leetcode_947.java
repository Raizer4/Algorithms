package practice.leetcode.graphs.medium;

// Most Stones Removed with Same Row or Column
// https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/description/

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Leetcode_947 {
    public static void main(String[] args) {
        int[][] stones = {{0, 0}, {0,1}, {1,0}, {1,2}, {2,1}, {2,2}};
        System.out.println(removeStones(stones));
    }

    public static int removeStones(int[][] stones) {
        UnionFind uf = new UnionFind(40000);

        for (int[] arr : stones){
            uf.union(arr[0], arr[1] + 20000);
        }

        Set<Integer> set = new TreeSet<>();

        for (int[] arr : stones){
           set.add(uf.find(arr[0]));
        }

        return stones.length - set.size();
    }

    private static class UnionFind {
        int[] base;

        public UnionFind(int size){
            base = new int[size];

            for (int i = 0; i < size; i++) {
                base[i] = i;
            }
        }

        public int find(int x){
            if (base[x] != x){
               base[x] = find(base[x]);
            }
            return base[x];
        }


        public void union(int x, int y){
            int tempx = find(x);
            int tempy = find(y);

            if (tempx != tempy){
                base[tempx] = tempy;
            }
        }

    }

}
