package practice.leetcode;

// Trapping Rain Water
// https://leetcode.com/problems/trapping-rain-water/description/

public class Leetcode_42 {

    public static void main(String[] args) {
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;

        int lMax = height[l];
        int rMax = height[r];

        int res = 0;

        while (l < r){
            if (lMax > rMax){
                r--;
                if (rMax - height[r] > 0){
                    res += rMax - height[r];
                }
                rMax = Math.max(rMax, height[r]);
            }else {
                l++;
                if (lMax - height[l] > 0){
                    res += lMax - height[l];
                }
                lMax = Math.max(lMax, height[l]);
            }
        }


        return res;
    }

}
