package practice.leetcode.hash_table.medium;

// Integer to Roman
// https://leetcode.com/problems/integer-to-roman/description/?envType=study-plan-v2&envId=top-interview-150

import java.util.HashMap;

public class Leetcode_12 {

    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }

    public static String intToRoman(int num) {
        HashMap<Integer, Character> map = new HashMap<>();

        map.put(1, 'I');
        map.put(2, 'V');

        map.put(3, 'X');
        map.put(4, 'L');

        map.put(5, 'C');
        map.put(6, 'D');

        map.put(7, 'M');

        String s = String.valueOf(num);
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int index = (s.length() - i) + (s.length() - i - 1);
            int value = Integer.parseInt(String.valueOf(s.charAt(i)));

            if (value == 0){
                continue;
            }else if (value == 4 || value == 9){
                builder.append(map.get(index));
                if (value == 4){
                    builder.append(map.get(index + 1));
                }else {
                    builder.append(map.get(index + 2));
                }
                continue;
            } else if (value > 3) {
                builder.append(map.get(index + 1));
                value = value - 5;
            }

            for (int j = 0; j < value; j++) {
                builder.append(map.get(index));
            }

        }

        return builder.toString();
    }

}
