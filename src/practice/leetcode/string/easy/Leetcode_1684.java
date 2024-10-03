package practice.leetcode.string.easy;

// Count the Number of Consistent Strings
// https://leetcode.com/problems/count-the-number-of-consistent-strings/description/

import java.util.HashSet;
import java.util.Set;

public class Leetcode_1684 {

    public static void main(String[] args) {
        System.out.println(countConsistentStrings("ab",new String[]{"ad","bd", "aaab", "baa", "badab"}));
        System.out.println(countConsistentStrings("abc",new String[]{"a","b","c", "ab", "ac", "bc", "abc"}));
    }

    public static int countConsistentStrings(String allowed, String[] words) {
        Set<Character> allowedSet = new HashSet<>();

        for (char c : allowed.toCharArray()) {
            allowedSet.add(c);
        }

        int count = 0;

        for (String word : words) {
            boolean isConsistent = true;

            for (char c : word.toCharArray()) {
                if (!allowedSet.contains(c)) {
                    isConsistent = false;
                    break;
                }
            }


            if (isConsistent) {
                count++;
            }
        }

        return count;
    }


}
