package practice.leetcode.two_pointers.medium;

// Make String a Subsequence Using Cyclic Increments
// https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/description/

public class Leetcode_2825 {

    public static void main(String[] args) {
        System.out.println(canMakeSubsequence("dby","z"));
    }

    public static boolean canMakeSubsequence(String str1, String str2) {
        int i = 0;
        int j = 0;

        while (i < str1.length() && j < str2.length()){
            int temp_1 = (str1.charAt(i) - 'a' + 1) % 26;
            int temp_2 = (str2.charAt(j) - 'a' + 1) % 26;

            if (temp_1 == temp_2 || (temp_1 + 1) % 26 == temp_2){
               j++;
            }
            i++;
        }

        return j == str2.length();
    }

}
