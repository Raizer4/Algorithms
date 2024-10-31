package practice.leetcode.leetcode_75.decision.day_11.similar;

import java.util.Locale;

public class Leetcode_2938 {

    public static void main(String[] args) {
    //    System.out.println(minimumSteps("0111"));
   //     System.out.println(minimumSteps("101"));
        System.out.println(minimumSteps("11000111"));
    }

    public static long minimumSteps(String s) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '0'){
                builder.insert(0,'0');
            }else {
                builder.append('1');
            }
        }

        int count = 0;

        StringBuilder str = new StringBuilder(s);

        int i = 0;
        int j = 1;

        while (true){
            if (builder.toString().equals(str.toString())){
                return count;
            }

            if (str.charAt(i) == '1' && str.charAt(j) == '0'){
                str.setCharAt(i,'0');
                str.setCharAt(j,'1');
                i++;
                j++;
                count++;
            } else if (str.charAt(i) == '1' && str.charAt(j) == '1') {
                int k = j + 1;

                while (str.charAt(k) == '1') {

                }

            }else {
                i++;
                j++;
            }

        }

        return count;
    }

}
