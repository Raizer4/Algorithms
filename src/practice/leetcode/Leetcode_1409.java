package practice.leetcode;

// Queries on a Permutation With Key
// https://leetcode.com/problems/queries-on-a-permutation-with-key/description/?envType=problem-list-v2&envId=binary-indexed-tree

public class Leetcode_1409 {

    public static void main(String[] args) {
        System.out.println(processQueries(new int[]{3,1,2,1}, 5));
        System.out.println(processQueries(new int[]{4,1,2,2}, 4));
        System.out.println(processQueries(new int[]{7,5,5,8,3}, 8));
    }

    static class FenwickTree {
        private int[] tree;
        private int n;

        public FenwickTree(int size) {
            n = size + 1;
            tree = new int[n];
        }


        public void update(int idx, int delta) {
            idx++;
            while (idx < n) {
                tree[idx] += delta;
                idx += idx & -idx;
            }
        }

        public int query(int idx) {
            idx++;
            int sum = 0;
            while (idx > 0) {
                sum += tree[idx];
                idx -= idx & -idx;
            }
            return sum;
        }
    }

    public static int[] processQueries(int[] queries, int m) {
        int n = queries.length;
        int offset = m;
        FenwickTree bit = new FenwickTree(2 * m + 1);

        int[] numToRank = new int[m + 1];

        for (int i = 1; i <= m; i++) {
            numToRank[i] = i;
            bit.update(i + offset, 1);
        }

        int[] result = new int[n];
        int newRankCounter = 0;

        for (int i = 0; i < n; i++) {
            int q = queries[i];
            int rank = numToRank[q];

            result[i] = bit.query(rank + offset) - 1;
            bit.update(rank + offset, -1);

            int newRank = newRankCounter--;
            numToRank[q] = newRank;
            bit.update(newRank + offset, 1);
        }

        return result;
    }

}
