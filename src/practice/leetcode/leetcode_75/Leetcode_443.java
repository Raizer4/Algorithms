package practice.leetcode.leetcode_75;

// String Compression
// https://leetcode.com/problems/string-compression/description/?envType=study-plan-v2&envId=leetcode-75


public class Leetcode_443 {

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c', 'c'}));
        System.out.println(compress(new char[]{'a'}));
    }

    public static int compress(char[] chars) {
        int write = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;


            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }


            chars[write++] = currentChar;


            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }


}
