package practice.leetcode.array.easy;

// Check if All the Integers in a Range Are Covered
// https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/description/

public class Leetcode_1893 {

    public static void main(String[] args) {
        System.out.println(isCovered(new int[][]{{1,1}},1,50));
        System.out.println(isCovered(new int[][]{{1,2},{3,4},{5,6}},2,5));
        System.out.println(isCovered(new int[][]{{1,50}},1,50));
    }

    public static boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] isCovered = new boolean[51];

        for (int[] range : ranges) {
            int start = range[0];
            int end = range[1];
            for (int i = start; i <= end; i++) {
                isCovered[i] = true;
            }
        }

        for (int i = left; i <= right; i++) {
            if (!isCovered[i]) {
                return false;
            }
        }

        return true;
    }

}
