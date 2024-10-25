package practice.leetcode.leetcode_75.decision.day_5.similar;

// Count Binary Substrings
// https://leetcode.com/problems/count-binary-substrings/description/

import java.util.ArrayList;
import java.util.List;

public class Leetcode_696 {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
    }

    public static int countBinarySubstrings(String s) {
        List<Integer> groupLengths = new ArrayList<>();
        int count = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                groupLengths.add(count);
                count = 1;
            } else {
                count++;
            }
        }
        groupLengths.add(count);

        int result = 0;

        for (int i = 1; i < groupLengths.size(); i++) {
            result += Math.min(groupLengths.get(i - 1), groupLengths.get(i));
        }

        return result;
    }




}
