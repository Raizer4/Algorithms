package practice.challenge.leetcode_75.decision.day_6.similar;

// Minimum Number of Swaps to Make the String Balanced
// https://leetcode.com/problems/minimum-number-of-swaps-to-make-the-string-balanced/description/

public class Leetcode_1963 {

    public static void main(String[] args) {
        System.out.println(minSwaps("]]][[["));
    }

    public static int minSwaps(String s) {
        int balance = 0;
        int count = 0;

        char close = ']';
        char open = '[';

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == close){
                balance--;
            }else {
                balance++;
            }

            if (balance < 0){
                count++;
                balance = 1;
            }

        }

        return count;
    }

}
