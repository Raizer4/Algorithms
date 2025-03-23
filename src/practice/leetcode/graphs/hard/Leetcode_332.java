package practice.leetcode.graphs.hard;

// Reconstruct Itinerary
// https://leetcode.com/problems/reconstruct-itinerary/description/

import java.util.*;

public class Leetcode_332 {

    public static void main(String[] args) {
        System.out.println(findItinerary(new ArrayList<>()));
    }

    public static List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> adj = new HashMap<>();

        for (List<String> ticket : tickets) {
            String src = ticket.get(0);
            String dst = ticket.get(1);
            adj.computeIfAbsent(src, k -> new PriorityQueue<>()).offer(dst);
        }

        List<String> res = new ArrayList<>();
        dfs(adj, "JFK", res);

        Collections.reverse(res);
        return res;
    }

    private static void  dfs(Map<String, PriorityQueue<String>> adj,
                               String src,
                               List<String> res){
        PriorityQueue<String> queue = adj.get(src);

        while (queue != null && !queue.isEmpty()){
            String dst = queue.poll();
            dfs(adj, dst, res);
        }

        res.add(src);
    }

}
