package practice.leetcode.two_pointers.hard;

// Rearranging Fruits
// https://leetcode.com/problems/rearranging-fruits/description/?envType=daily-question&envId=2025-08-02

import java.util.*;

public class Leetcode_2561 {

    public static void main(String[] args) {
        System.out.println(minCost(new int[]{84,80,43,8,80,88,43,14,100,88}, new int[]{32,32,42,68,68,100,42,84,14,8}));
        System.out.println(minCost(new int[]{4,4,4,4,3}, new int[]{5,5,5,5,3}));
    }

    public static long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> map_1 = new HashMap<>();
        Map<Integer, Integer> map_2 = new HashMap<>();

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < basket1.length; i++) {
            map_1.put(basket1[i], map_1.getOrDefault(basket1[i], 0) + 1);
            map_2.put(basket2[i], map_2.getOrDefault(basket2[i], 0) + 1);

            min = Math.min(min, basket1[i]);
            min = Math.min(min, basket2[i]);
        }

        List<Integer> list_1 = new ArrayList<>();
        List<Integer> list_2 = new ArrayList<>();

        for (Integer key : map_1.keySet()) {

            if (map_2.containsKey(key)) {
                int one = map_1.get(key);
                int two = map_2.get(key);

                int temp = one + two;

                if (temp % 2 == 1) {
                    return -1;
                }

                if (one > two){
                    for (int i = 0; i < (one - (temp / 2)); i++) {
                        list_1.add(key);
                    }
                }

            }
            else {
                int temp = map_1.get(key);

                if (temp % 2 == 1) {
                    return -1;
                }

                for (int i = 0; i < (temp / 2); i++) {
                    list_1.add(key);
                }
            }

        }

        for (Integer key : map_2.keySet()){

            if (map_1.containsKey(key)) {
                int one = map_1.get(key);
                int two = map_2.get(key);

                int temp = one + two;

                if (temp % 2 == 1) {
                    return -1;
                }

                if (one < two){
                    for (int i = 0; i < (two - (temp / 2)); i++) {
                        list_2.add(key);
                    }
                }
            }
            else {
                int temp = map_2.get(key);

                if (temp % 2 == 1) {
                    return -1;
                }

                for (int i = 0; i < (temp / 2); i++) {
                    list_2.add(key);
                }
            }

        }

        Collections.sort(list_1);
        list_2.sort(Comparator.reverseOrder());

        long count = 0;

        for (int i = 0; i < list_1.size(); i++) {
            count += Math.min(Math.min(list_1.get(i), list_2.get(i)), min * 2);
        }


        return count;
    }

}
