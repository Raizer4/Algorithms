package practice.leetcode;

// Fruit Into Baskets
// https://leetcode.com/problems/fruit-into-baskets/description/

import java.util.HashMap;
import java.util.Map;

public class Leetcode_904 {

    public static void main(String[] args) {
        System.out.println(totalFruit(new int[]{1,2,3,2,2}));
    }

    public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> map = new HashMap<>();

        int unic = 0;
        int l = 0;
        int max = 0;

        for (int r = 0; r < fruits.length; r++) {
            if (!map.containsKey(fruits[r])) {
                map.put(fruits[r], 1);
                unic++;
            } else {
                map.put(fruits[r], map.getOrDefault(fruits[r], 0) + 1);
            }


            while (unic > 2) {
                Integer integer = map.get(fruits[l]);

                if (integer == 1){
                    map.remove(fruits[l]);
                    unic--;
                }else {
                    map.put(fruits[l], integer - 1);
                }

                l++;
            }

            max = Math.max (max, (r - l + 1));
        }

        return max;
    }

}
