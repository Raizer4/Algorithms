package practice.leetcode.graphs.medium;

// Cheapest Flights Within K Stops
// https://leetcode.com/problems/cheapest-flights-within-k-stops/description/

import java.util.*;

public class Leetcode_787 {


    public static void main(String[] args) {
        System.out.println(findCheapestPrice(4, new int[][]{{0,1,1},{0,2,5},{1,2,1},{2,3,1}}, 0, 3, 1));
    }


    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<int[]>> adj = new HashMap<>();
        for (int[] flight : flights) {
            adj.computeIfAbsent(flight[0], x -> new ArrayList<>()).add(new int[]{flight[1], flight[2]});
        }

        int[] costs = new int[n];
        int[] stops = new int[n];
        Arrays.fill(costs, Integer.MAX_VALUE);
        Arrays.fill(stops, Integer.MAX_VALUE);
        costs[src] = 0;
        stops[src] = 0;


        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{0, src, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currentCost = current[0];
            int currentCity = current[1];
            int currentStops = current[2];

            if (currentCity == dst) {
                return currentCost;
            }

            if (currentStops > k) {
                continue;
            }

            if (adj.containsKey(currentCity)) {
                for (int[] neighbor : adj.get(currentCity)) {
                    int nextCity = neighbor[0];
                    int nextCost = currentCost + neighbor[1];
                    int nextStops = currentStops + 1;

                    if (nextCost < costs[nextCity] || nextStops < stops[nextCity]) {
                        costs[nextCity] = nextCost;
                        stops[nextCity] = nextStops;
                        pq.offer(new int[]{nextCost, nextCity, nextStops});
                    }
                }
            }
        }

        return -1;
    }

}
