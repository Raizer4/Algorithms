package practice.leetcode.siliding_window.medium;

// Alternating Groups II
// https://leetcode.com/problems/alternating-groups-ii/description/

public class Leetcode_3208 {

    public static void main(String[] args) {
        System.out.println(numberOfAlternatingGroups(new int[]{0,1,0,1,0}, 3));
    }

    public static int numberOfAlternatingGroups(int[] colors, int k) {
        int n = colors.length;

        boolean[] broken = new boolean[n];

        for (int i = 0; i < n; i++) {
            int next = (i + 1) % n;
            broken[i] = (colors[i] == colors[next]);
        }

        int count = 0;
        int errorsInWindow = 0;

        for (int i = 0; i < k-1; i++) {
            if (broken[i]) errorsInWindow++;
        }
        if (errorsInWindow == 0) count++;


        for (int i = 1; i < n; i++) {
            int left = i - 1;
            int right = (i + k - 2) % n;

            if (broken[left]) errorsInWindow--;
            if (broken[right]) errorsInWindow++;

            if (errorsInWindow == 0) count++;
        }

        return count;
    }

}
