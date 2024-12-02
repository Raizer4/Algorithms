package practice.challenge.leetcode_75.decision.day_43.similar;

// Find the Town Judge
// https://leetcode.com/problems/find-the-town-judge/description/

public class Leetcode_997 {

    public static void main(String[] args) {
        System.out.println(findJudge(4, new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}}));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n + 1];

        for (int[] t : trust) {
            trustCount[t[1]]++;
            trustCount[t[0]]--;
        }

        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }


}
