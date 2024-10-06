package practice.leetcode;

// Minimum String Length After Removing Substrings
// https://leetcode.com/problems/minimum-string-length-after-removing-substrings/description/

public class Leetcode_2696 {

    public static void main(String[] args) {
        System.out.println(minLength("ABFCACDB"));
    }

    public static int minLength(String s) {
        StringBuilder builder = new StringBuilder(s);

        while (builder.indexOf("AB") != -1 || builder.indexOf("CD") != -1) {
            if (builder.indexOf("AB") != -1) {
                int ab = builder.indexOf("AB");
                builder.delete(ab,ab + 2);
            } else if (builder.indexOf("CD") != -1) {
                int ab = builder.indexOf("CD");
                builder.delete(ab,ab + 2);
            }
        }

        return builder.length();
    }

}
