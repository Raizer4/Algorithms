package practice.challenge.leetcode_75.decision.day_7.similar;

// Ant on the Boundary
// https://leetcode.com/problems/ant-on-the-boundary/description/

public class Leetcode_3028 {

    public static void main(String[] args) {
        System.out.println(returnToBoundaryCount(new int[]{2,3,-5}));
        System.out.println(returnToBoundaryCount(new int[]{3,2,-3,-4}));
    }

    public static int returnToBoundaryCount(int[] nums) {
        int count = 0;
        int sum = 0;

        for (int temp : nums){
            sum += temp;
            if (sum == 0){
                count++;
            }
        }

        return count;
    }

}
