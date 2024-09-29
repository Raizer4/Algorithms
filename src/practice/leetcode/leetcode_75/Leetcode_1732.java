package practice.leetcode.leetcode_75;

// Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1732 {

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    public static int largestAltitude(int[] gain) {
        int[] brr = new int[gain.length + 1];
        brr[0] = 0;
        brr[1] = brr[0] + gain[0];

        for (int i = 2; i < brr.length; i++) {
            brr[i] = brr[i - 1] + gain[i - 1];
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < brr.length; i++) {
            max = Math.max(brr[i], max);
        }

        return max;
    }

}
