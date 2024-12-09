package practice.leetcode.two_pointers.medium;

// Container With Most Water
// https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_11 {

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
        System.out.println(maxArea(new int[]{1,1}));
    }

    public static int maxArea(int[] height) {
        int max = 0;

        int i = 0;
        int j = height.length - 1;

        while (i < j){
            int min = Math.min(height[i],height[j]);
            int sum = min * (j - i);

            max = Math.max(sum,max);

            if (height[i] > height[j]){
                j--;
            }else {
                i++;
            }

        }

        return max;
    }


}
