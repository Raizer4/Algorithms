package practice.leetcode.leetcode_75.decision.day_9.similar;

// Check If String Is a Prefix of Array
// https://leetcode.com/problems/check-if-string-is-a-prefix-of-array/description/

public class Leetcode_1961 {

    public static void main(String[] args) {
        System.out.println(isPrefixString("iloveleetcode",new String[]{"i","love","leetcode","apples"}));
    }

    public static boolean isPrefixString(String s, String[] words) {
        StringBuilder builder = new StringBuilder();

        for (String temp : words){
            builder.append(temp);
            if (builder.toString().equals(s)){
                return true;
            }
        }

        return false;
    }

}
