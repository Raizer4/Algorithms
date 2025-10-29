package practice.leetcode;

// Removing Minimum Number of Magic Beans
// https://leetcode.com/problems/removing-minimum-number-of-magic-beans/description/

import java.util.Arrays;

public class Leetcode_2171 {

    public static void main(String[] args) {
        System.out.println(minimumRemoval(new int[]{4,1,6,5}));
    }

    public static long minimumRemoval(int[] beans) {
        Arrays.sort(beans);

        long[] prefix = new long[beans.length + 1];

        for (int i = 1; i <= beans.length; i++) {
            prefix[i] = prefix[i - 1] + beans[i - 1];
        }

        long answer = Long.MAX_VALUE;

        for (int i = 1; i <= beans.length; i++) {
            long num = prefix[i - 1] + ((prefix[prefix.length -1] - prefix[i]) - ((long) beans[i - 1] * (beans.length - i)));

            if (answer > num){
                answer = num;
            }
        }

        return answer;
    }

}
