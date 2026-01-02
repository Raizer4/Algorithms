package practice.leetcode;

// Maximum Value of an Ordered Triplet II
// https://leetcode.com/problems/maximum-value-of-an-ordered-triplet-ii/description/

public class Leetcode_2874 {

    public static void main(String[] args) {
        System.out.println(maximumTripletValue(new int[]{18,15,8,13,10,9,17,10,2,16,17}));
    }

    public static long maximumTripletValue(int[] nums) {
        int[] rightMaxArr = new int[nums.length];
        rightMaxArr[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            rightMaxArr[i] = Math.max(rightMaxArr[i - 1], nums[i]);
        }

        int[] leftMaxArr = new int[nums.length];
        leftMaxArr[nums.length - 1] = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            leftMaxArr[i] = Math.max(leftMaxArr[i + 1], nums[i]);
        }

        long answer = 0;

        for (int i = 1; i < nums.length - 1; i++) {
            long num = ((long) (rightMaxArr[i - 1] - nums[i]) * leftMaxArr[i + 1]);
            if (answer < num){
                answer = num;
            }
        }

        return answer;
    }

}
