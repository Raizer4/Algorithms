package practice.leetcode;

// Shuffle String
// https://leetcode.com/problems/shuffle-string/description/

import java.util.*;

public class Leetcode_1528 {

    public static void main(String[] args) {
        System.out.println(restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
        System.out.println(restoreString("abc",new int[]{0,1,2}));
    }

    public static String restoreString(String s, int[] indices) {
       char[] chars = new char[indices.length];

       for (int i = 0; i < s.length(); i++){
           chars[indices[i]] = s.charAt(i);
       }

        return new String(chars);
    }

}
