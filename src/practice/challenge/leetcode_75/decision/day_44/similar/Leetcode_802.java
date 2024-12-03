package practice.challenge.leetcode_75.decision.day_44.similar;

// Find Eventual Safe States
// https://leetcode.com/problems/find-eventual-safe-states/description/

import java.util.*;

public class Leetcode_802 {

    public static void main(String[] args) {
        int[][] graph1 = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        System.out.println(eventualSafeNodes(graph1));

        int[][] graph2 = {{1, 2, 3, 4}, {1, 2}, {3, 4}, {0, 4}, {}};
        System.out.println(eventualSafeNodes(graph2));
    }


    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;

        List<Integer> list = new ArrayList<>();
        int[] curent = new int[n];

        for (int i = 0; i < n; i++){
            if (dfs(i,curent, graph)){
                list.add(i);
            }
        }

        Collections.sort(list);
        return list;
    }

    public static boolean dfs(int index,int[] curent ,int[][] graph) {
        if (curent[index] != 0){
            return curent[index] == 2;
        }

        curent[index] = 1;

        for (int temp : graph[index]){
            if (!dfs(temp, curent, graph)){
                return false;
            }
        }

        curent[index] = 2;
        return true;
    }




}
