package practice.leetcode.queue.medium;

// Find the Winner of the Circular Game
// https://leetcode.com/problems/find-the-winner-of-the-circular-game/description/

import java.util.ArrayDeque;
import java.util.Deque;

public class Leetcode_1823 {

    public static void main(String[] args) {
        System.out.println(findTheWinner(6,5));
    }

    public static int findTheWinner(int n, int k) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 1; i <= n; i++) {
            deque.add(i);
        }


        while (deque.size() > 1) {

            for (int i = 1; i < k; i++) {
                deque.addLast(deque.pollFirst());
            }

            deque.pollFirst();
        }


        return deque.peekFirst();
    }



}
