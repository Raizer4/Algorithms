package practice.leetcode.prefix_sum.medium;

// Divide Intervals Into Minimum Number of Groups
// https://leetcode.com/problems/divide-intervals-into-minimum-number-of-groups/description/

public class Leetcode_2406 {

    public static void main(String[] args) {
        System.out.println(minGroups(new int[][]{
                {5,10},
                {6,8},
                {1,5},
                {2,3},
                {1,10}
        }));
    }

    public static int minGroups(int[][] intervals) {
        int max = 0;

        for (int[] arr : intervals){
            max = Math.max(max, arr[1]);
        }

        int[] prefix = new int[max + 2];

        for (int[] arr : intervals){
            prefix[arr[0]]++;
            prefix[arr[1]+1]--;
        }

        int maxim = 0;

        for (int i = 1; i < prefix.length; i++){
            int temp = prefix[i - 1] + prefix[i];
            maxim = Math.max(temp, maxim);
            prefix[i] = temp;
        }

        return maxim;
    }

}
