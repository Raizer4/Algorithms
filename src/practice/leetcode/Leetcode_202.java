package practice.leetcode;

// Happy Number
// https://leetcode.com/problems/happy-number/description/?envType=problem-list-v2&envId=hash-table&difficulty=EASY

import java.util.HashSet;
import java.util.Set;

public class Leetcode_202 {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)){
            set.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    private static int getNext(int n){
        int totalSum = 0;

        while (n > 0){
            int digit = n % 10;
            totalSum += Math.pow(digit,2);
            n /= 10;
        }

        return totalSum;
    }


}
