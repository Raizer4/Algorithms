package practice.leetcode.string.medium;

// Zigzag Conversion
// https://leetcode.com/problems/zigzag-conversion/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.ArrayList;
import java.util.List;

public class Leetcode_6 {

    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
        System.out.println(convert("ABCD", 2));
    }

    public static String convert(String s, int numRows) {
        if (numRows == 1){
            return s;
        }

        List<StringBuilder> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }

        list.get(0).append(s.charAt(0));

        int index = 1;

        boolean flag = true;

        while (index < s.length()){

            if (flag) {
                for (int i = 1; i < numRows && index < s.length(); i++) {
                    list.get(i).append(s.charAt(index++));
                }
                flag  = false;
            }else {
                for (int i = numRows - 2; i >= 0 && index < s.length(); i--) {
                    list.get(i).append(s.charAt(index++));
                }
                flag = true;
            }
        }

        StringBuilder answer = new StringBuilder();

        for (StringBuilder temp : list){
            answer.append(temp.toString());
        }

        return answer.toString();
    }

}
