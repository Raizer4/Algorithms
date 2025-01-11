package practice.leetcode.string.easy;

// Maximum Odd Binary Number
// https://leetcode.com/problems/maximum-odd-binary-number/description/

public class Leetcode_2864 {

    public static void main(String[] args) {
        System.out.println(maximumOddBinaryNumber("010"));
        System.out.println(maximumOddBinaryNumber("0101"));
    }

    public static String maximumOddBinaryNumber(String s) {
        StringBuilder builder = new StringBuilder();

        int o = 0;
        int i = 0;

        for (int k = 0; k < s.length(); k++){
            if (s.charAt(k) == '0'){
                o++;
            }else if (s.charAt(k) == '1'){
                i++;
            }
        }

        i--;
        char f = '1';

        while (0 < i || o > 0){
            if (i > 0){
                builder.append("1");
                i--;
            }else if (o > 0){
                builder.append("0");
                o--;
            }
        }

        return builder.append(f).toString();
    }

}
