package practice.leetcode.array.easy;

//  Find the Number of Good Pairs I
// https://leetcode.com/problems/find-the-number-of-good-pairs-i/description/

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Leetcode_3162 {

    public static void main(String[] args) {
        System.out.println(numberOfPairs(new int[]{1,2,4,12}, new int[]{2,4}, 3));
    }

    public static int numberOfPairs(int[] nums1, int[] nums2, int k) {
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int temp = nums2[j] * k;
                if (nums1[i] % temp == 0){
                    count++;
                }
            }
        }

        return count;
    }


}
