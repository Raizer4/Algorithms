package practice.challenge.leetcode_75.decision.day_27.similar;

// Reveal Cards In Increasing Order
// https://leetcode.com/problems/reveal-cards-in-increasing-order/description/

import java.util.*;

public class Leetcode_950 {

    public static void main(String[] args) {
        int[] ints = deckRevealedIncreasing(new int[]{17, 13, 11, 2, 3, 5, 7});

        for (int temp : ints){
            System.out.print(temp + " ");
        }

    }

    public static int[] deckRevealedIncreasing(int[] deck) {
        if (deck.length <= 1){
            return deck;
        }


        Arrays.sort(deck);
        Deque<Integer> deque = new ArrayDeque();

        deque.add(deck[deck.length - 2]);
        deque.add(deck[deck.length - 1]);

        for (int i = deck.length - 3; i >= 0 ; i--){
            Integer integer_1 = deque.pollLast();
            deque.push(integer_1);
            deque.push(deck[i]);
        }


        int[] res = new int[deck.length];
        int i = 0;

        for (int temp : deque){
            res[i++] = temp;
        }

        return res;
    }


}
