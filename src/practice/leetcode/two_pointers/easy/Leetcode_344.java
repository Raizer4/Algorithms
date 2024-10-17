package practice.leetcode.two_pointers.easy;

// Reverse String
// https://leetcode.com/problems/reverse-string/description/

public class Leetcode_344 {

    public static void main(String[] args) {
        reverseString(new char[]{'h','e','l','l','o'});
    }

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;

        while (i < j){
           char temp = s[i];
           s[i] = s[j];
           s[j] = temp;

           j--;
           i++;
        }

    }

}

