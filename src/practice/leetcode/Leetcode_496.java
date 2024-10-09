package practice.leetcode;

// Next Greater Element I
// https://leetcode.com/problems/next-greater-element-i/description/

import java.util.*;

public class Leetcode_496 {

    public static void main(String[] args) {
        int[] ints = nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2});

        for (int temp : ints){
            System.out.println(temp);
        }
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> nextGreaterMap = new HashMap<>();
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = nums2.length -1; i >= 0; i--){
            int num = nums2[i];

            while (!stack.isEmpty() && stack.peek() <= num){
                stack.pop();
            }

            if(!stack.isEmpty()){
                nextGreaterMap.put(num,stack.peek());
            }else{
                nextGreaterMap.put(num, -1);
            }

            stack.push(num);
        }


        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }

}
