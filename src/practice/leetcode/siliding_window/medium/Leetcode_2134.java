package practice.leetcode.siliding_window.medium;

// Minimum Swaps to Group All 1's Together II
// https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/description/

public class Leetcode_2134 {

    public static void main(String[] args) {
        System.out.println(minSwaps(new int[]{0,1,0,1,1,0,0}));
        System.out.println(minSwaps(new int[]{0,1,1,1,0,0,1,1,0}));
        System.out.println(minSwaps(new int[]{1,1,0,0,1 }));
    }

    public static int minSwaps(int[] nums) {
        int n = nums.length;
        int countOnes = 0;

        for (int num : nums) {
            if (num == 1) {
                countOnes++;
            }
        }

        if (countOnes == 0 || countOnes == n){
            return 0;
        }

        int[] extended = new int[2 * n];

        for (int i = 0; i < 2 * n; i++) {
            extended[i] = nums[i % n];
        }


        int maxOnesInWindow = 0, currentOnes = 0;
        for (int i = 0; i < countOnes; i++) {
            if (extended[i] == 1) {
                currentOnes++;
            }
        }

        maxOnesInWindow = currentOnes;

        for (int i = countOnes; i < 2 * n; i++) {
            if (extended[i] == 1) {
                currentOnes++;
            }
            if (extended[i - countOnes] == 1) {
                currentOnes--;
            }
            maxOnesInWindow = Math.max(maxOnesInWindow, currentOnes);
        }

        return countOnes - maxOnesInWindow;
    }

}
