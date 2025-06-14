package practice.leetcode.two_pointers.medium;

// Adding Spaces to a String
// https://leetcode.com/problems/adding-spaces-to-a-string/description/

public class Leetcode_2109 {

    public static void main(String[] args) {
        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[]{8,13,15}));
    }

    public static String addSpaces(String s, int[] spaces) {
        StringBuilder builder = new StringBuilder();

        int start = 0;

        for (int temp : spaces){
           builder.append(s.substring(start, temp));
           builder.append(" ");
           start = temp;
        }

        builder.append(s.substring(start, s.length()));

        return builder.toString();
    }

}
