package practice.leetcode.siliding_window.easy;

// Count Substrings That Satisfy K-Constraint I
// https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i/description/

public class Leetcode_3258 {

    public static void main(String[] args) {
        System.out.println(countKConstraintSubstrings("10101",1));
        System.out.println(countKConstraintSubstrings("1010101",2));
        System.out.println(countKConstraintSubstrings("11111",1));
    }

    public static int countKConstraintSubstrings(String s, int k) {
        int n = s.length();
        int left = 0, zeros = 0, ones = 0, count = 0;

        for (int right = 0; right < n; right++){

            if (s.charAt(right) == '0'){
                zeros++;
            }else {
                ones++;
            }

            while (zeros > k && ones > k){
                if (s.charAt(left) == '0'){
                    zeros--;
                }else {
                    ones--;
                }
                left++;
            }
            count += (right - left + 1);
        }

        return count;
    }


}
