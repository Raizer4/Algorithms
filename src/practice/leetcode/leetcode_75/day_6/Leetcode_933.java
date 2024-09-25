package practice.leetcode.leetcode_75.day_6;

// Number of Recent Calls
// https://leetcode.com/problems/number-of-recent-calls/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_933 {

    static class RecentCounter {
        Queue<Integer> queue;

        public RecentCounter() {
          queue = new LinkedList<>();
        }

        public int ping(int t) {
            queue.add(t);

            while (queue.peek() < t - 3000){
                queue.poll();
            }

            return queue.size();
        }

    }


    public static void main(String[] args) {
        RecentCounter counter = new RecentCounter();
        System.out.println(counter.ping(0));
        System.out.println(counter.ping(1));
        System.out.println(counter.ping(100));
        System.out.println(counter.ping(3001));
        System.out.println(counter.ping(3002));
    }

}
