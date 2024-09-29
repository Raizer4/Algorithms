package practice.leetcode.leetcode_75;

// Smallest Number in Infinite Set
// https://leetcode.com/problems/smallest-number-in-infinite-set/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.PriorityQueue;

public class Leetcode_2336 {

    static class SmallestInfiniteSet {
        PriorityQueue<Integer> queue = new PriorityQueue();

        public SmallestInfiniteSet() {
            for (int i = 1; i <= 1000; i++){
                queue.add(i);
            }
        }

        public int popSmallest() {
            return queue.poll();
        }

        public void addBack(int num) {
            if (!queue.contains(num)){
                queue.add(num);
            }
        }
    }

    public static void main(String[] args) {
        SmallestInfiniteSet smallestInfiniteSet = new SmallestInfiniteSet();
        smallestInfiniteSet.addBack(2); // 2 уже есть в наборе, поэтому никаких изменений не вносится.
        smallestInfiniteSet.popSmallest(); // верните 1, поскольку 1 - наименьшее число, и удалите его из набора.
        smallestInfiniteSet.popSmallest(); // возвращает 2 и удаляет его из набора.
        smallestInfiniteSet.popSmallest(); // возвращает 3 и удаляет его из набора.
        smallestInfiniteSet.addBack(1); // 1 добавляется обратно в набор.
        smallestInfiniteSet.popSmallest(); // возвращает 1, поскольку 1 было добавлено обратно в набор, и
        // это наименьшее число, и удалите его из набора.
        smallestInfiniteSet.popSmallest(); // возвращает 4 и удаляет его из набора.
        smallestInfiniteSet.popSmallest();
    }



}
