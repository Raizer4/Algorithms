package practice.leetcode.random.easy.string;

// Permutation Difference between Two Strings
// https://leetcode.com/problems/permutation-difference-between-two-strings/description/

public class Leetcode_3146 {

    public static void main(String[] args) {
        System.out.println(findPermutationDifference("abc","bac"));
        System.out.println(findPermutationDifference("abcde","edbac"));
    }

    public static int findPermutationDifference(String s, String t) {
        StringBuilder builder = new StringBuilder(t);
        int result = 0;

        for (int i = 0; i < s.length(); i++){
            int i1 = builder.indexOf(String.valueOf(s.charAt(i)));
            result += Math.abs(i - i1);
        }

        return result;
    }

}
