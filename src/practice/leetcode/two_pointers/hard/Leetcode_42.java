package practice.leetcode.two_pointers.hard;

// Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/description/

public class Leetcode_42 {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int l = 0;
        int r = height.length - 1;

        int maxL = height[l];
        int maxR = height[r];

        int res = 0;

        while (l < r){
            if (maxL > maxR){
                r--;
                int temp = maxR - height[r];
                if (temp > 0){
                    res += temp;
                }
                maxR = Math.max(maxR, height[r]);
            }else {
                l++;
                int temp = maxL - height[l];
                if (temp > 0){
                    res += temp;
                }
                maxL = Math.max(maxL, height[l]);
            }
        }

        return res;
    }

}
