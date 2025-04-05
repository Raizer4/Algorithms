package practice.leetcode.design.medium;

// Detect Squares
// https://leetcode.com/problems/detect-squares/description/

import java.util.*;

public class Leetcode_2013 {

    public static void main(String[] args) {
        DetectSquares detectSquares = new DetectSquares();
        detectSquares.add(new int[]{3, 10});
        detectSquares.add(new int[]{11, 2});
        detectSquares.add(new int[]{3, 2});
        detectSquares.count(new int[]{11, 10}); // return 1. You can choose:
        //   - The first, second, and third points
        detectSquares.count(new int[]{14, 8});  // return 0. The query point cannot form a square with any points in the data structure.
        detectSquares.add(new int[]{11, 2});    // Adding duplicate points is allowed.
        detectSquares.count(new int[]{11, 10}); // return 2. You can choose:
        //   - The first, second, and third points
        //   - The first, third, and fourth points
    }

    static class DetectSquares {
        private Map<List<Integer>, Integer> ptsCount;
        private List<List<Integer>> pts;

        public DetectSquares() {
            ptsCount = new HashMap<>();
            pts = new ArrayList<>();
        }

        public void add(int[] point) {
            List<Integer> p = Arrays.asList(point[0], point[1]);
            ptsCount.put(p, ptsCount.getOrDefault(p, 0) + 1);
            pts.add(p);
        }

        public int count(int[] point) {
            int res = 0;
            int px = point[0], py = point[1];

            for (List<Integer> pt : pts){
                int x = pt.get(0), y = pt.get(1);

                if (Math.abs(py - y) != Math.abs(px - x) || x == px || y == py){
                    continue;
                }

                res += ptsCount.getOrDefault(Arrays.asList(x, py), 0) *
                       ptsCount.getOrDefault(Arrays.asList(px, y), 0);
            }

            return res;
        }
    }

}
