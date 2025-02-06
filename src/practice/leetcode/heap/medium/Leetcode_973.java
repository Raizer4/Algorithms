package practice.leetcode.heap.medium;

// K Closest Points to Origin
// https://leetcode.com/problems/k-closest-points-to-origin/description/

import java.util.PriorityQueue;

public class Leetcode_973 {

    public static void main(String[] args) {
        System.out.println(kClosest(new int[][]{{1},{4}}, 2));
    }

    public static int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Integer[]> queue = new PriorityQueue<>( (a,b) -> {
            return (int) (b[0] - a[0]);
        });

        for (int[] arr : points){
            int sqrt = (int) ((int) Math.pow(Math.abs(arr[0] - 0), 2) + Math.pow(Math.abs(arr[1] - 0), 2));
            Integer[] doubles = new Integer[]{sqrt, arr[0], arr[1]};
            queue.offer(doubles);
            if (queue.size() > k){
                queue.poll();
            }
        }

        int[][] res = new int[queue.size()][2];

        int i = 0;

        for (Integer[] arr : queue){
            int[] temp = new int[]{arr[1], arr[2]};
            res[i++] = temp;
        }


        return res;
    }

}
