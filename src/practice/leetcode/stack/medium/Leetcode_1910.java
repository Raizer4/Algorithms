package practice.leetcode.stack.medium;

// Remove All Occurrences of a Substring
// https://leetcode.com/problems/remove-all-occurrences-of-a-substring/description/

public class Leetcode_1910 {

    public static void main(String[] args) {
        System.out.println(removeOccurrences("aabababa","aba"));
    }

    public static String removeOccurrences(String s, String part) {
        while (s.contains(part)){
           s =  s.replaceFirst(part,"");
        }

        return s;
    }

}
