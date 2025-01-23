package practice.leetcode.siliding_window.hard;

// Sliding Window Maximum
// https://leetcode.com/problems/sliding-window-maximum/description/

import java.util.*;

public class Leetcode_239 {

    public static void main(String[] args) {
        int[] ints = maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3);
        for (int temp : ints){
            System.out.print(temp + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n - k + 1];

        Deque<Integer> q = new LinkedList<>();

        int l = 0;
        int r = 0;

        while (r < n){

            while (!q.isEmpty() && nums[q.getLast()] < nums[r]){
                q.removeLast();
            }

            q.addLast(r);


            if (l > q.getFirst()){
                q.removeFirst();
            }

            if ((r + 1) >= k){
                output[l] = nums[q.getFirst()];
                l++;
            }

            r++;
        }

        return output;
    }

}
