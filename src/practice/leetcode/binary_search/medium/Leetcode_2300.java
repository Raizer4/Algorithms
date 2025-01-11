package practice.leetcode.binary_search.medium;

// Successful Pairs of Spells and Potions
// https://leetcode.com/problems/successful-pairs-of-spells-and-potions/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.Arrays;

public class Leetcode_2300 {

    public static void main(String[] args) {
        int[] ints = successfulPairs(new int[]{5, 1, 3}, new int[]{1, 2, 3, 4, 5}, 7);

        for (int temp : ints){
            System.out.print(temp + " ");
        }

    }

    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);

        int[] res = new int[spells.length];
        int i = 0;

        for (Integer temp : spells){
            int l = 0;
            int r = potions.length - 1;
            int index = potions.length;

            while (l <= r){
                int m = l + (r - l) / 2;

                if (( (long) potions[m] * temp) >= success){
                    index = m;
                    r = m - 1;
                }else {
                    l = m + 1;
                }

            }

            res[i++] = potions.length - index;
        }

        return res;
    }

}
