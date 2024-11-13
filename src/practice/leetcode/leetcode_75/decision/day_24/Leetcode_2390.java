package practice.leetcode.leetcode_75.decision.day_24;

// Removing Stars From a String
// https://leetcode.com/problems/removing-stars-from-a-string/description/?envType=study-plan-v2&envId=leetcode-75

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Leetcode_2390 {

    public static void main(String[] args) {
        System.out.println(removeStars("leet**cod*e"));
        System.out.println(removeStars("erase*****"));
    }

    public static String removeStars(String s) {
        StringBuilder builder = new StringBuilder();

        for (char temp : s.toCharArray()){
            if (temp == '*'){
                builder.deleteCharAt(builder.length() - 1);
            } else {
                builder.append(temp);
            }
        }

        return builder.toString();
    }

}
