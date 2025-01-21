package practice.leetcode.siliding_window.medium;

// Number of Substrings Containing All Three Characters
// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/submissions/1515852554/

public class Leetcode_2090 {

    public static void main(String[] args) {
        System.out.println(numberOfSubstrings("abcabc"));
    }

    public static int numberOfSubstrings(String s) {
        int[] count = new int[3];
        int left = 0;
        int res = 0;

        for (int r = 0; r < s.length(); r++) {
            count[s.charAt(r) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0){
                count[s.charAt(left) - 'a']--;
                left++;
            }

            res += left;
        }

        return res;
    }

}
