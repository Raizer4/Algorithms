package practice.leetcode;

// Missing Number
// https://leetcode.com/problems/missing-number/description/

import java.util.TreeSet;

public class Leetcode_268 {

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3,0,1}));
        System.out.println(missingNumber(new int[]{0,1}));
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    public static int missingNumber(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int temp : nums){
            set.add(temp);
        }

        int k = 0;

        for (Integer temp : set){
            if (temp == k){
                k++;
            } else {
                return k;
            }
        }

        return set.last() + 1;
    }

}
