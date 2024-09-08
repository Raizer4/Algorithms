package practice.leetcode.random.easy.hash_table;

// Roman to Integer
// https://leetcode.com/problems/roman-to-integer/description/

import java.util.HashMap;

public class Leetcode_13 {

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        char[] array = s.toCharArray();

        HashMap<Character,Integer> map = new HashMap();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--){
            char c = s.charAt(i);
            Integer num = map.get(c);

            if (prev > num){
                result -= num;
            }else {
                result += num;
            }
            prev = num;
        }

        return result;
    }

}
