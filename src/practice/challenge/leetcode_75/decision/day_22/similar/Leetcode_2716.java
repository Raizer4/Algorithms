package practice.challenge.leetcode_75.decision.day_22.similar;

// Minimize String Length
// https://leetcode.com/problems/minimize-string-length/description/

import java.util.Set;
import java.util.TreeSet;



public class Leetcode_2716 {

    public static void main(String[] args) {
        System.out.println(minimizedStringLength("baadccab"));
    }

    public static int minimizedStringLength(String s) {
        Set<Character> set = new TreeSet<>();
        for (char temp : s.toCharArray()){
            set.add(temp);
        }
        return set.size();
    }

}
