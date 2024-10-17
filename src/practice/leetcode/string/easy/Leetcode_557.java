package practice.leetcode.string.easy;

// Reverse Words in a String III
// https://leetcode.com/problems/reverse-words-in-a-string-iii/description/

public class Leetcode_557 {

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] arr = s.split(" ");

        for (String temp : arr){
            builder.append(new StringBuilder(temp).reverse());
            builder.append(" ");
        }

        return builder.toString().trim();
    }


}
