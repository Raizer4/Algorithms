package practice.leetcode.leetcode_75.day_3;

// Container With Most Water
// https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_11 {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
    }

    public static int maxArea(int[] height) {
        int max = 0;

        int left = 0;
        int right = height.length - 1;


        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int width = right - left;
            int area = minHeight * width;


            max = Math.max(max, area);


            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }

}
