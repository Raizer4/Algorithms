package practice.leetcode.string.easy;

// Reverse Prefix of Word
// https://leetcode.com/problems/reverse-prefix-of-word/description/

import java.io.FilterOutputStream;

public class Leetcode_2000 {

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd",'d'));
    }

    public static String reversePrefix(String word, char ch) {
        StringBuilder builder = new StringBuilder();

        int i = word.indexOf(ch);
        if (i == -1){
            return word;
        }

        StringBuilder temp = new StringBuilder(word.substring(0, i + 1)).reverse();
        builder.append(temp);
        builder.append(word.substring(i + 1,word.length()));

        return builder.toString();
    }

}
