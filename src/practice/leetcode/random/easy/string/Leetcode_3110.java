package practice.leetcode.random.easy.string;

// Score of a String
// https://leetcode.com/problems/score-of-a-string/description/

public class Leetcode_3110 {

    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }

    public static int scoreOfString(String s) {
        int sum = 0;

        for (int i = 0; i < s.length() - 1; i++){
            int c = s.charAt(i);
            int h = s.charAt(i + 1);

            sum += Math.abs(c - h);
        }

        return sum;
    }

}
