package practice.leetcode.heap.easy;

// Largest Number After Digit Swaps by Parity
// https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/description/

import java.util.Comparator;
import java.util.PriorityQueue;

public class Leetcode_2231 {

    public static void main(String[] args) {
        System.out.println(largestInteger(1234));
    }

    public static int largestInteger(int num) {
        PriorityQueue<Integer> even = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> odd = new PriorityQueue<>(Comparator.reverseOrder());

        for (char temp : String.valueOf(num).toCharArray()) {
            int anInt = Integer.parseInt(String.valueOf(temp));

            if (anInt % 2 == 0) {
                even.add(anInt);
            } else {
                odd.add(anInt);
            }
        }

        String res = "";

        for (char temp : String.valueOf(num).toCharArray()){
            if (Integer.parseInt(String.valueOf(temp)) % 2 == 0){
                res += even.poll();
            }else {
                res += odd.poll();
            }
        }

        return Integer.parseInt(res);
    }

}
