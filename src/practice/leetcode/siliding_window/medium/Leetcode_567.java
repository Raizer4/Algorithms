package practice.leetcode.siliding_window.medium;

// Permutation in String
// https://leetcode.com/problems/permutation-in-string/description/

public class Leetcode_567 {

    public static void main(String[] args) {
        System.out.println(checkInclusion("ab","eidbaooo"));
    }

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }

        int[] s1Count = new int[26];
        int[] s2Count = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            s1Count[s1.charAt(i) - 'a']++;
            s2Count[s2.charAt(i) - 'a']++;
        }

        int matches = 0;

        for (int i = 0; i < 26; i++) {
            if (s1Count[i] == s2Count[i]){
                matches++;
            }
        }

        int l = 0;

        for (int r = s1.length(); r < s2.length(); r++){
            if (matches == 26){
                return true;
            }

            int index = s2.charAt(r) - 'a';
            s2Count[index]++;

            if (s1Count[index] == s2Count[index]){
                matches++;
            }else if (s1Count[index] + 1 == s2Count[index]) {
                matches--;
            }

            index = s2.charAt(l) - 'a';
            s2Count[index]--;

            if (s1Count[index] == s2Count[index]){
                matches++;
            }else if (s1Count[index] - 1 == s2Count[index]){
                matches--;
            }

            l++;
        }

        return matches == 26;
    }

}
