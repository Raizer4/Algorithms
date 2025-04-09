package practice.leetcode.two_pointers.easy;

// Assign Cookies
// https://leetcode.com/problems/assign-cookies/description/

import java.util.Arrays;

public class Leetcode_455 {

    public static void main(String[] args) {
        System.out.println(findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;


        int count = 0;

        while (i < g.length && j < s.length){
            if (g[i] <= s[j]){
                i++;
                j++;
                count++;
            }else {
                j++;
            }
        }

        return count;
    }

}
