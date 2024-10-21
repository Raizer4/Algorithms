package practice.leetcode.array.easy;

// Minimum Operations to Exceed Threshold Value I
// https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/description/

public class Leetcode_3065 {

    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{2,11,10,1,3},10));
    }

    public static int minOperations(int[] nums, int k) {
        int count = 0;

        for (int temp : nums){
            if (temp < k){
                count++;
            }
        }

        return count;
    }

}
