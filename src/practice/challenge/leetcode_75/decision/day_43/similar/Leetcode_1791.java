package practice.challenge.leetcode_75.decision.day_43.similar;

// Find Center of Star Graph
// https://leetcode.com/problems/find-center-of-star-graph/description/

public class Leetcode_1791 {

    public static void main(String[] args) {
        int[][] res = new int[][]{{1,2},{2,3},{4,2}};
        System.out.println(findCenter(res));
    }

    public static int findCenter(int[][] edges) {
        if (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) {
            return edges[0][0];
        }
        return edges[0][1];
    }

}
