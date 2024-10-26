package practice.leetcode.leetcode_75.decision.day_6;

// Reverse Words in a String
// https://leetcode.com/problems/reverse-words-in-a-string/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_151 {

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords(" hello world "));
        System.out.println(reverseWords("a good example"));
    }

    public static String reverseWords(String s) {
        s.trim();

        String[] s1 = s.split("\\s+");

        StringBuilder builder = new StringBuilder();

        for (int i = s1.length - 1; i >= 0; i--){
            builder.append(s1[i]);
            builder.append(" ");
        }

        return builder.toString().trim();
    }


}
