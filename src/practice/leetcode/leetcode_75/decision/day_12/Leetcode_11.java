package practice.leetcode.leetcode_75.decision.day_12;

// Container With Most Water
// https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_11 {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;

        int max = 0;


        while (i < j){
            int temp = (j - i) * (Math.min(height[i], height[j]));
            max = Math.max(max,temp);

            if (height[i] > height[j]){
                j--;
            }else {
                i++;
            }
        }

        return max;
    }


}
