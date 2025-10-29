package practice.leetcode.binary_search.medium;

// Most Profit Assigning Work
// https://leetcode.com/problems/most-profit-assigning-work/description/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Leetcode_826 {

    public static void main(String[] args) {
        System.out.println(maxProfitAssignment(new int[]{5,50,92,21,24,70,17,63,30,53}, new int[]{68,100,3,99,56,43,26,93,55,25}, new int[]{96,3,55,30,11,58,68,36,26,1}));
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < difficulty.length; i++) {
            list.add(new int[]{difficulty[i], profit[i]});
        }

        list.sort(Comparator.comparingInt(arr -> arr[0]));

        int prefix = Integer.MIN_VALUE;

        for (int[] arr : list){
            prefix = Math.max(prefix, arr[1]);

            arr[1] = prefix;
        }


        int sum = 0;

        for (int temp : worker){
            int l = 0;
            int r = list.size() - 1;

            int num = 0;

            while (l <= r){
                int m = l + (r - l) / 2;

                int[] arr = list.get(m);

                if (arr[0] <= temp){
                    num = arr[1];
                    l = m + 1;
                }else {
                    r = m - 1;
                }
            }

            sum += num;
        }

        return sum;
    }

}
