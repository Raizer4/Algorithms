package practice.leetcode.binary_search.easy;

// Find Smallest Letter Greater Than Target
// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

public class Leetcode_744 {

    public static void main(String[] args) {
        System.out.println(nextGreatestLetter(new char[]{'a', 'c', 'e', 'x', 'z'}, 'f'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int num = target - 'a' + 1;

        int l = 0;
        int r = letters.length - 1;

        char res = ' ';

        while (l <= r){
            int m = l + (r - l) / 2;
            int temp = letters[m] - 'a' + 1;

            if (num >= temp){
                l = m + 1;
            }else {
                res = letters[m];
                r = m - 1;
            }
        }

        if (res == ' '){
            return letters[0];
        }

        return res;
    }


}
