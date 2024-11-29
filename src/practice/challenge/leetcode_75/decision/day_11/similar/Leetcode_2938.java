package practice.challenge.leetcode_75.decision.day_11.similar;

// Separate Black and White Balls
// https://leetcode.com/problems/separate-black-and-white-balls/description/

public class Leetcode_2938 {

    public static void main(String[] args) {
        System.out.println(minimumSteps("0111"));
        System.out.println(minimumSteps("101"));
        System.out.println(minimumSteps("11000111"));
    }

    public static long minimumSteps(String s) {
        int size = s.length();

        long steps = 0;
        int sumRight = 0;

        for(int i = size - 1; i >= 0; i--){
            char chr = s.charAt(i);

            if (chr == '1'){
                steps += size - 1 - i - sumRight;
            }

            sumRight += (chr - '0');
        }

        return steps;
    }

}
