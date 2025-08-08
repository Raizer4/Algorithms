package practice.leetcode.prefix_sum.medium;

// Ways to Make a Fair Array
// https://leetcode.com/problems/ways-to-make-a-fair-array/description/

public class Leetcode_1664 {

    public static void main(String[] args) {
        System.out.println(waysToMakeFair(new int[]{2,1,6,4}));
    }

    public static int waysToMakeFair(int[] nums) {
        int n = nums.length;

        int[] prefixEven = new int[n + 1];
        int[] prefixOdd= new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixEven[i + 1] = prefixEven[i];
            prefixOdd[i + 1] = prefixOdd[i];

            if (i % 2 == 0){
                prefixEven[i + 1] += nums[i];
            }else {
                prefixOdd[i + 1] += nums[i];
            }
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (prefixEven[i] + (prefixOdd[prefixOdd.length - 1] - prefixOdd[i + 1]) == prefixOdd[i] + (prefixEven[prefixEven.length - 1] - prefixEven[i + 1])){
                count++;
            }
        }

        return count;
    }

}
