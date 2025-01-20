package practice.leetcode.siliding_window.easy;

// Alternating Groups I
// https://leetcode.com/problems/alternating-groups-i/description/


public class Leetcode_3206 {

    public static void main(String[] args) {
        System.out.println(numberOfAlternatingGroups(new int[]{0,1,0,0,1}));
    }

    public static int numberOfAlternatingGroups(int[] colors) {
        int count = 0;

        for (int r = 0; r < colors.length; r++) {
            if (colors[r] != colors[(r + 1) % colors.length] && colors[r] == colors[(r + 2) % colors.length]){
                count++;
            }
        }

        return count;
    }

}
