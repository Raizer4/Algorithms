package practice.leetcode.two_pointers.hard;

// Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/description/

public class Leetcode_42 {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{3,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int maxL= height[l];
        int maxR = height[r];

        int res = 0;

        while (l < r){
            if (maxL < maxR){
                l++;
                if (maxL - height[l] > 0){
                    res += maxL - height[l];
                }
                maxL = Math.max(maxL,height[l]);
            }else {
                r--;
                if (maxR - height[r] > 0){
                    res += maxR - height[r];
                }
                maxR = Math.max(maxR, height[r]);
            }
        }

        return res;
    }

}
