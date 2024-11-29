package practice.challenge.leetcode_75.decision.day_14.similar;

// Count Substrings That Satisfy K-Constraint I
// https://leetcode.com/problems/count-substrings-that-satisfy-k-constraint-i/description/

public class Leetcode_3258 {

    public static void main(String[] args) {
        System.out.println(countKConstraintSubstrings("10101",1));
        System.out.println(countKConstraintSubstrings("1010101",2));
        System.out.println(countKConstraintSubstrings("11111",1));
    }

    public static int countKConstraintSubstrings(String s, int k) {
        int count = s.length();

        int predicted = 2;

        while (predicted <= s.length()){
            count += checkSubstring(predicted,s,k);
            predicted++;
        }

        return count;
    }

    private static int checkSubstring(int predicted, String s, int k) {
        int count = 0;
        int i = 0;

        while (predicted <= s.length()) {
            if (countingSub(s.substring(i, predicted), k)) {
                count++;
            }
            i++;
            predicted++;
        }

        return count;
    }

    private static boolean countingSub(String sub, int k){
        int i = 0;
        int o = 0;

        for (char t : sub.toCharArray()){
            if (t == '0'){
                o++;
            }else {
                i++;
            }
        }

       return !(i > k && o > k);
    }
}
