package practice.leetcode.array.easy;

// Find the Town Judge
// https://leetcode.com/problems/find-the-town-judge/description/

public class Leetcode_997 {

    public static void main(String[] args) {
        System.out.println(findJudge(4, new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}}));
    }

    public static int findJudge(int n, int[][] trust) {
        int[] arr = new int[n + 1];

        for (int[] temp : trust){
            arr[temp[0]]--;
            arr[temp[1]]++;
        }

        for (int i = 0; i < arr.length; i++){
            int temp = arr[i];

            if (temp == n - 1){
                return i;
            }
        }


        return -1;
    }


}
