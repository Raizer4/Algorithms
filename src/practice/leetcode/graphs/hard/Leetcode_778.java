package practice.leetcode.graphs.hard;

// Swim in Rising Water
// https://leetcode.com/problems/swim-in-rising-water/description/

import java.util.Comparator;
import java.util.PriorityQueue;

public class Leetcode_778 {

    public static void main(String[] args) {
        System.out.println(swimInWater(new int[][]{{0,1,2,3,4},{24,23,22,21,5}, {12,13,14,15,16}, {11,17,18,19,20}, {10,9,8,7,6}}));
    }

    private static int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    private static int ROWS;
    private static int COLS;

    public static int swimInWater(int[][] grid) {
        ROWS = grid.length;
        COLS = grid[0].length;

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        priorityQueue.add(new int[]{grid[0][0],0,0});

        boolean[][] visited = new boolean[ROWS][COLS];

        int max = Integer.MIN_VALUE;

        while (!priorityQueue.isEmpty()){
            int[] poll = priorityQueue.poll();

            int temp = poll[0];

            max = Math.max(max,temp);

            int i = poll[1];
            int j = poll[2];

            visited[i][j] = true;

            if (i == grid.length - 1 && j == grid[0].length - 1){
                break;
            }

            for (int[] arr : directions){
                int row = i + arr[0];
                int col = j + arr[1];

                if (row >= 0 && row < ROWS && col >= 0 && col < COLS && !visited[row][col]){
                    priorityQueue.add(new int[]{grid[row][col], row, col});
                }
            }

        }


        return max;
    }

}
