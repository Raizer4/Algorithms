package practice.leetcode.graphs.medium;

// Number of Provinces
// https://leetcode.com/problems/number-of-provinces/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_547 {

    public static void main(String[] args) {
        System.out.println(findCircleNum(new int[][]{
                {1,1,0},
                {1,1,0},
                {0,0,1}}
        ));
    }

    private static boolean[] visited;

    public static int findCircleNum(int[][] isConnected) {
        visited = new boolean[isConnected.length];

        int count = 0;

        for (int r = 0; r < isConnected.length; r++) {
            for (int c = 0; c < isConnected.length; c++) {
                if (!visited[r] && isConnected[r][c] == 1){
                    dfs(r,c,isConnected);
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    private static void dfs(int r, int c, int[][] matrix){
        if (visited[r]){
            return;
        }

        visited[r] = true;

        for (int i = c; i < matrix.length; i++) {
            if (r == i){
                continue;
            }

            if (matrix[r][i] == 1){
                dfs(i,0,matrix);
            }
        }

    }


}
