package practice.leetcode.two_pointers.medium;

// Maximum Distance Between a Pair of Values
// https://leetcode.com/problems/maximum-distance-between-a-pair-of-values/description/

public class Leetcode_1855 {

    public static void main(String[] args) {
        System.out.println(maxDistance(new int[]{55, 30, 5, 4, 2}, new int[]{100, 20, 10, 10, 5}));
    }

    public static int maxDistance(int[] nums1, int[] nums2) {
        int i = nums1.length - 1;
        int j = nums2.length - 1;

        int answer = 0;

        while (i >= 0 && j >= 0){
            while (i >= 0 && j >= 0 && nums1[i] > nums2[j]){
                j--;
            }
            answer = Math.max(answer, j - i);
            i--;
        }

        return answer;
    }

}
