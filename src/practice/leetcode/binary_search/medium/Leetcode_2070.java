package practice.leetcode.binary_search.medium;

// Most Beautiful Item for Each Query
// https://leetcode.com/problems/most-beautiful-item-for-each-query/description/

import java.util.Arrays;

public class Leetcode_2070 {

    public static void main(String[] args) {
        System.out.println(maximumBeauty(new int[][]{
                {1,2},{3,2},{2,4},{5,6},{3,5}
        }, new int[]{1,2,3,4,5,6}));
    }

    public static int[] maximumBeauty(int[][] items, int[] queries) {
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));

        int[] prefix = new int[items.length];

        int max = 0;
        int i = 0;

        for (int[] arr : items) {
            max = Math.max(max, arr[1]);
            prefix[i++] = max;
        }

        int[] answer = new int[queries.length];

        for (int j = 0; j < queries.length; j++) {
            int l = 0;
            int r = items.length - 1;

            int index = -1;

            while (l <= r){
                int m = l + (r - l) / 2;

                if (items[m][0] <= queries[j]){
                    index = m;
                    l = m + 1;
                }else {
                    r = m - 1;
                }
            }

            if (index == -1){
                answer[j] = 0;
            }else {
                answer[j] = prefix[index];
            }

        }

        return answer;
    }

}
