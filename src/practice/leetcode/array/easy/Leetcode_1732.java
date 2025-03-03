package practice.leetcode.array.easy;

// Find the Highest Altitude
// https://leetcode.com/problems/find-the-highest-altitude/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_1732 {

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5,1,5,0,-7}));
        System.out.println(largestAltitude(new int[]{-4,-3,-2,-1,4,3,2}));
    }

    public static int largestAltitude(int[] gain) {
        int max = 0;
        int count = 0;

        for (int temp : gain){
            count += temp;
            max = Math.max(max,count);
        }

        return max;
    }

}
