package practice.leetcode.graphs.easy;

// Find Center of Star Graph
// https://leetcode.com/problems/find-center-of-star-graph/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_1791 {

    public static void main(String[] args) {
        int[][] res = new int[][]{{1,2},{2,3},{4,2}};
        System.out.println(findCenter(res));
    }

    public static int findCenter(int[][] edges) {
        List<List<Integer>> graphs = new ArrayList<>();

        for (int i = 0; i < edges.length + 2; i++){
            graphs.add(new ArrayList<>());
        }

        for (int[] arr : edges){
            graphs.get(arr[0]).add(arr[1]);
            graphs.get(arr[1]).add(arr[0]);
        }

        for (int i = 1; i <= graphs.size(); i++){

            if (graphs.get(i).size() == edges.length){
                return i;
            }
        }

        return -1;
    }

}
