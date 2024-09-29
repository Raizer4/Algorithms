package practice.leetcode.string.easy;

// Check If Two String Arrays are Equivalent
// https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/description/

public class Leetcode_1816 {

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant",4));
        System.out.println(truncateSentence("What is the solution to this problem",4));
        System.out.println(truncateSentence("chopper is not a tanuki",5));
    }

    public static String truncateSentence(String s, int k) {
        String[] s1 = s.split(" ");
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (String temp : s1){
            if (i < k) {
                result.append(temp);
                result.append(" ");
                i++;
            }else {break;}
        }

        return result.toString().trim();
    }

}
