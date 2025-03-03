package practice.leetcode.two_pointers.easy;

// Is Subsequence
// https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75

public class Leetcode_392 {

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc","ahbgdc"));
        System.out.println(isSubsequence("axc","ahbgdc"));
    }

    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;

        while (j < t.length() && i < s.length()){
            if (s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        }

        return i >= s.length();
    }


}
