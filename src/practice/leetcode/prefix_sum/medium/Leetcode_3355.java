package practice.leetcode.prefix_sum.medium;

// Zero Array Transformation I
// https://leetcode.com/problems/zero-array-transformation-i/description/

public class Leetcode_3355 {

    public static void main(String[] args) {
        System.out.println(isZeroArray(new int[]{4,3,2,1}, new int[][]{{1,3}, {0, 2}}));
        System.out.println(isZeroArray(new int[]{1,0,1}, new int[][]{{0, 2}}));
    }

    public static boolean isZeroArray(int[] nums, int[][] queries) {
        int[] prefix = new int[nums.length + 1];

        for (int[] arr : queries){
            prefix[arr[0]] -= 1;
            prefix[arr[1] + 1] += 1;
        }

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = (prefix[i] + prefix[i - 1]);
        }

        for (int i = 0; i < nums.length; i++) {
            int temp = (nums[i] - prefix[i]);

            if (temp > 0){
                return false;
            }

        }

        return true;
    }

}
