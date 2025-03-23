package practice.leetcode.graphs.medium;

// Network Delay Time
// https://leetcode.com/problems/network-delay-time/description/

import java.util.*;

public class Leetcode_743 {

    public static void main(String[] args) {
        System.out.println(networkDelayTime(new int[][]{{1,2,4},{3,5,5},{2,3,3}}, 4, 2));
    }

    public static int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> edges = new HashMap<>();

        for (int[] time : times){
            edges.computeIfAbsent(time[0] , x -> new ArrayList<>()).add(new int[]{time[1], time[2]});
        }

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        minHeap.offer(new int[]{0, k});

        Set<Integer> visited = new HashSet<>();
        int t = 0;

        while (!minHeap.isEmpty()){
            int[] curr = minHeap.poll();
            int w1 = curr[0], n1 = curr[1];
            if (visited.contains(n1)){
                continue;
            }
            visited.add(n1);
            t = w1;

            if (edges.containsKey(n1)){
                for (int[] next : edges.get(n1)){
                    int n2 = next[0], w2 = next[1];
                    if (!visited.contains(n2)){
                        minHeap.offer(new int[]{w1 + w2, n2});
                    }
                }
            }

        }


        return visited.size() == n ? t : -1;
    }

}
