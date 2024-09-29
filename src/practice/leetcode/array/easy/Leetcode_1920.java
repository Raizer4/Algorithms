package practice.leetcode.array.easy;

// Build Array from Permutation
// https://leetcode.com/problems/build-array-from-permutation/description/

public class Leetcode_1920 {

    public static void main(String[] args) {
        int[] ints = buildArray(new int[]{0, 2, 1, 5, 3, 4});
        for (int temp : ints) {
            System.out.println(temp);
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
