package practice.leetcode.string.easy;

// Convert Date to Binary
// https://leetcode.com/problems/convert-date-to-binary/description/

public class Leetcode_3280 {

    public static void main(String[] args) {
        System.out.println(convertDateToBinary("2080-02-29"));
    }

    public static String convertDateToBinary(String date) {
        StringBuilder builder = new StringBuilder();

        String[] s = date.split("-");

        for (String temp : s){
           builder.append(Integer.toBinaryString(Integer.valueOf(temp)));
           builder.append("-");
        }

        builder.deleteCharAt(builder.length()-1);

        return builder.toString();
    }

}
