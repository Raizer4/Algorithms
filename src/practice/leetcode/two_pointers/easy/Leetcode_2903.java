package practice.leetcode.two_pointers.easy;

// Find Indices With Index and Value Difference I
// https://leetcode.com/problems/find-indices-with-index-and-value-difference-i/description/

public class Leetcode_2903 {

    public static void main(String[] args) {
        int[] indices = findIndices(new int[]{5, 1, 4, 1}, 2, 4);

        for (int temp : indices){
            System.out.print(temp + " ");
        }
    }

    public static int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference){
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{-1,-1};
    }

}
