package practice.leetcode;

// Ransom Note
// https://leetcode.com/problems/ransom-note/description/

import java.util.Arrays;

public class Leetcode_383 {

    public static void main(String[] args) {

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        char[] arr_1 = ransomNote.toCharArray();
        char[] arr_2 = magazine.toCharArray();

        Arrays.sort(arr_1);
        Arrays.sort(arr_2);

        int i = 0;
        int j = 0;

        while (j < arr_1.length && i < arr_2.length){
            if (arr_1[j] == arr_2[i]){
                j++;
            }
            i++;
        }

        return j == arr_1.length - 1;
    }

}
