package practice.leetcode.array.easy;

// Two Furthest Houses With Different Colors
// https://leetcode.com/problems/two-furthest-houses-with-different-colors/description/

public class Leetcode_2078 {

    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{4,4,4,11,4,4,11,4,4,4,4,4}));
        System.out.println(maxDistance(new int[]{1,8,3,8,3}));
        System.out.println(maxDistance(new int[]{0,1}));
    }


    public static int maxDistance(int[] colors) {
        int n = colors.length;

        if (colors[0] != colors[n - 1]) {
            return n - 1;
        }

        int maxDist = 0;

        for (int i = 1; i < n; i++) {
            if (colors[i] != colors[0]) {
                maxDist = Math.max(maxDist, i);
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (colors[i] != colors[n - 1]) {
                maxDist = Math.max(maxDist, n - 1 - i);
            }
        }

        return maxDist;
    }

}
