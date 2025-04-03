package practice.leetcode.greedy.medium;

// Hand of Straights
// https://leetcode.com/problems/hand-of-straights/description/

import java.util.*;

public class Leetcode_846 {

    public static void main(String[] args) {
        System.out.println(isNStraightHand(new int[]{1, 2, 3, 6, 2, 3, 4, 7, 8}, 3));
    }

    public static boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0){
            return false;
        }

        Arrays.sort(hand);

        Map<Integer, Integer> map = new HashMap<>();

        for (int temp : hand){
            map.put(temp, map.getOrDefault(temp, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < hand.length; i++) {
            if (list.contains(hand[i]) || map.get(hand[i]) == 0){
                continue;
            }

            if (!list.isEmpty()){
                if (list.get(list.size() - 1) != (hand[i] - 1) ){
                    return false;
                }
            }

            list.add(hand[i]);
            map.put(hand[i], map.get(hand[i]) - 1);

            if (list.size() == groupSize){
                i = 0;
                list.clear();
            }

        }

        return list.isEmpty();
    }

}
