package practice.leetcode.siliding_window.easy;

// Find the K-Beauty of a Number
// https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/

public class Leetcode_2269 {

    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240,2));
        System.out.println(divisorSubstrings(430043,2));
    }

    public static int divisorSubstrings(int num, int k) {
        int count = 0;

        String str = String.valueOf(num);

        for (int r = k; r <= str.length(); r++) {
            Integer temp = Integer.parseInt(str.substring(r - k, r));

            if (temp != 0 && num % temp == 0){
                count++;
            }
        }

        return count;
    }

}
