package practice.leetcode.binary_search.medium;

// Maximum Number of Integers to Choose From a Range I
// https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/description/

import java.util.HashSet;
import java.util.Set;

public class Leetcode_2554 {

    public static void main(String[] args) {
        System.out.println(maxCount(new int[]{1,6,5},5,6));
    }

    public static int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for (int temp:banned){
            if (temp <= n) {
                set.add(temp);
            }
        }

        int[] available = new int[n - set.size()];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)){
                available[index++] = i;
            }
        }

        long[] prefix = new long[available.length + 1];
        for (int i = 0; i < available.length; i++) {
            prefix[i + 1] = prefix[i] + available[i];
        }

        int l = 0;
        int r = available.length;
        int answer = 0;

        while (l <= r){
            int m = l + (r- l) / 2;
            if (prefix[m] <= maxSum){
                answer = m;
                l = m + 1;
            }else {
                r = m - 1;
            }
        }

        return answer;
    }

}
