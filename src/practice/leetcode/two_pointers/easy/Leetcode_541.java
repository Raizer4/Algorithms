package practice.leetcode.two_pointers.easy;

// Reverse String II
// https://leetcode.com/problems/reverse-string-ii/description/


public class Leetcode_541 {

    public static void main(String[] args) {
        System.out.println(reverseStr("abcdefg",2));
        System.out.println(reverseStr("abcdef",3));
        System.out.println(reverseStr("ba",1));
    }

    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i += 2 * k) {
            int end = Math.min(i + k - 1, chars.length - 1);
            reverse(chars, i, end);
        }

        return new String(chars);
    }


    private static void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }

}
