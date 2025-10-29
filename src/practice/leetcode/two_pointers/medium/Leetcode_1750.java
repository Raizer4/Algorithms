package practice.leetcode.two_pointers.medium;

// Minimum Length of String After Deleting Similar Ends
// https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends/description/

public class Leetcode_1750 {

    public static void main(String[] args) {
        System.out.println(minimumLength("aabccabba"));
    }

    public static int minimumLength(String s) {
        int l = 0;
        int r = s.length() - 1;

        while (s.charAt(l) == s.charAt(r) && l < r){
            char c = s.charAt(l);

            while (s.charAt(l) == c && l < s.length() - 1){
                l++;
            }

            while (s.charAt(r) == c && r > 0){
                r--;
            }

        }

        int num =  s.length() - (l + s.length() - (r + 1));

        if (num < 0){
            return 0;
        }

        return num;
    }

}
