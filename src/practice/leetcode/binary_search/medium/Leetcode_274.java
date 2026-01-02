package practice.leetcode.binary_search.medium;

import java.util.Arrays;

public class Leetcode_274 {

    public static void main(String[] args) {
        System.out.println(hIndex(new int[]{3,0,6,1,5}));
    }

    public static int hIndex(int[] citations) {
        Arrays.sort(citations);
        int l = 0;
        int r = citations.length;

        int answer = 0;

        while (l <= r){
            int m = l + (r - l) / 2;

            int count = 0;

            for (int temp : citations){
                if (m <= temp){
                    count++;
                }
            }

            if (m <= count){
                answer = m;
                l = m + 1;
            }else {
                r = m - 1;
            }

        }

        return answer;
    }

}
