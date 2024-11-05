package practice.leetcode.leetcode_75.decision.day_16.similar;

// Find the K-Beauty of a Number
// https://leetcode.com/problems/find-the-k-beauty-of-a-number/description/

public class Leetcode_2269 {

    public static void main(String[] args) {
        System.out.println(divisorSubstrings(240,2));
        System.out.println(divisorSubstrings(430043,2));
    }

    public static int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        int i = 0;

        while (k <= s.length()){
            String substring = s.substring(i, k);
            int anInt = Integer.parseInt(substring);


            if (anInt != 0 && num % anInt == 0){
                count++;
            }
            i++;
            k++;
        }

        return count;
    }

}
